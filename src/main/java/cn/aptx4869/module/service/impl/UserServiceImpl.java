package cn.aptx4869.module.service.impl;

import cn.aptx4869.module.mapper.UserMapper;
import cn.aptx4869.module.po.User;
import cn.aptx4869.module.po.UserExample;
import cn.aptx4869.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getUserList() {
        UserExample example = new UserExample();
        return userMapper.queryAll();
        //return userMapper.selectByExample(example);
    }
}
