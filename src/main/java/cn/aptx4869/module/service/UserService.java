package cn.aptx4869.module.service;

import cn.aptx4869.module.po.User;
import com.github.pagehelper.Page;

import java.util.List;

public interface UserService {
    /**
     *
     * @return
     */
    Page<User> getUserList();

    /**
     *
     */
    void insertUsers();
}
