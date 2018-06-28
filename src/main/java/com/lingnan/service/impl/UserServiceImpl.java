package com.lingnan.service.impl;

import com.lingnan.bean.User;
import com.lingnan.service.IUserService;
import org.apache.log4j.Logger;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/28.
 */
public class UserServiceImpl implements IUserService{

    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public User login(String userName, String password) {

        this.logger.info(userName + ": " + password);
        if (userName != null && userName.equals(password))
            return new User(userName, password, new Date(), true);
        return null;
    }
}
