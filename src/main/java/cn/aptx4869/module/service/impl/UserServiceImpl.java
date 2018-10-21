package cn.aptx4869.module.service.impl;

import cn.aptx4869.module.mapper.UserMapper;
import cn.aptx4869.module.po.User;
import cn.aptx4869.module.po.UserExample;
import cn.aptx4869.module.service.UserService;
import cn.aptx4869.module.util.TestDataGenerator;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public Page<User> getUserList() {
        UserExample example = new UserExample();
        Page<User> query = new Page<User>(1,3);
        return userMapper.queryAll(1, 3);
        //return userMapper.selectByExample(example);
    }

    public void insertUsers() {
        for(User user : TestDataGenerator.generateUsers(50)){
            userMapper.insertSelective(user);
        }
    }
}
