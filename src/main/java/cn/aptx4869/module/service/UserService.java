package cn.aptx4869.module.service;

import cn.aptx4869.module.po.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    /**
     *
     * @return
     */
    PageInfo<User> getUserList();

    /**
     *
     */
    void insertUsers();
}
