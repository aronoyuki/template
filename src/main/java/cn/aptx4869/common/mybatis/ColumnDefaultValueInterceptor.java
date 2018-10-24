package cn.aptx4869.common.mybatis;


import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.util.Properties;

/**
 * @author huy
 * @date 2018/10/23 19:09
 * @description
 */
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class })
})
public class ColumnDefaultValueInterceptor implements Interceptor {

    public Object intercept(Invocation invocation) throws Throwable {
        return null;
    }

    public Object plugin(Object o) {
        return null;
    }

    public void setProperties(Properties properties) {

    }
}
