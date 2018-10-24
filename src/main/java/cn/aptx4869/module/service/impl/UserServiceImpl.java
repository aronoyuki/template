package cn.aptx4869.module.service.impl;

import cn.aptx4869.module.mapper.UserMapper;
import cn.aptx4869.module.po.User;
import cn.aptx4869.module.po.UserExample;
import cn.aptx4869.module.service.UserService;
import cn.aptx4869.module.util.TestDataGenerator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public PageInfo<User> getUserList() {
        UserExample example = new UserExample();
        Page<User> query = new Page<User>(1,3);
        PageHelper.startPage(1,5);
        //startPage后紧跟的这个查询就是分页查询
        Page<User> emps = userMapper.queryAll(1, 3);
        //使用PageInfo包装查询结果，只需要将pageInfo交给页面就可以
        //pageINfo封装了分页的详细信息，也可以指定连续显示的页数


        return userMapper.queryAll(1, 3).toPageInfo();
        //return userMapper.selectByExample(example);
    }

    public void insertUsers() {
        for(User user : TestDataGenerator.generateUsers(50)){
            userMapper.insertSelective(user);
        }
    }
}
