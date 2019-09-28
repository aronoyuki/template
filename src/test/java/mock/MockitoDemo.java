package mock;

import cn.aptx4869.module.po.User;
import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.TypeReference;

import java.util.List;

/**
 * @author huy
 * @date 2018/10/29 17:22
 * @description
 */
public class MockitoDemo {

    public static void main(String[] args) {
        User user = JMockData.mock(User.class);
        List<User> userList = JMockData.mock(new TypeReference<List<User>>() {});
        System.out.println(userList.toString());
    }
}
