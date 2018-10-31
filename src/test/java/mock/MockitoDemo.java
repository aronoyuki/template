package mock;

import cn.aptx4869.module.po.User;
import com.github.jsonzou.jmockdata.JMockData;
import org.mockito.Mockito;

/**
 * @author huy
 * @date 2018/10/29 17:22
 * @description
 */
public class MockitoDemo {

    public static void main(String[] args) {
        User user = Mockito.mock(User.class);
        User user1 = JMockData.mock(User.class);
        System.out.println(user1);
    }
}
