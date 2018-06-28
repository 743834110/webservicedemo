package com.lingnan.service;

import com.lingnan.bean.User;

/**
 * Created by Administrator on 2018/6/28.
 */
public interface IUserService {

    User login(String userName, String password);
}
