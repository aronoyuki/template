package cn.aptx4869.module.util;

import cn.aptx4869.module.po.User;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class TestDataGenerator {
    public static List<User> generateUsers(Integer number){
        List<User> users = new LinkedList<User>();
        for(int i = 0; i < number; i ++){
            User user = new User();
            user.setUuid(UUID.randomUUID().toString().replace("-", ""));
            user.setCode(String.valueOf(1000 + i));
            user.setName("你大爷始终是你大爷");
            user.setPassword("password");
            user.setSalt("salt");
            user.setCreateTime(new Date());
            user.setUpdateTime(new Date());
            user.setCreatorId("1");
            user.setUpdaterId("1");
            user.setDeleted(0);
            user.setVersion(1l);
            users.add(user);
        }
        return users;
    }
}
