package netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author huy
 * @date 2019/3/11 10:07
 * @description
 */
public class NettyClientDemo {
    public static void main(String[] args) {
        String host = "192.168.3.53";
        int port = 8899;
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            Bootstrap b = new Bootstrap(); // (1)
            b.group(workerGroup); // (2)
            b.channel(NioSocketChannel.class); // (3)
            b.option(ChannelOption.SO_KEEPALIVE, true); // (4)
            b.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                        @Override
                        public void channelActive(final ChannelHandlerContext ctx) throws Exception {
                            final ByteBuf time = ctx.alloc().buffer(4); // (2)
                            time.writeInt((int) (System.currentTimeMillis() / 1000L + 2208988800L));

                            final ChannelFuture f = ctx.writeAndFlush(time); // (3)
                            f.addListener(new ChannelFutureListener() {
                                public void operationComplete(ChannelFuture future) {
                                    assert f == future;
                                    ctx.close();
                                }
                            }); // (4)
                        }

                        @Override
                        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
                            cause.printStackTrace();
                            super.exceptionCaught(ctx, cause);
                        }
                    });
                }
            });

            // Start the client.
            ChannelFuture f = b.connect(host, port).sync(); // (5)

            // Wait until the connection is closed.
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }
}
