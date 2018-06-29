package com.lingnan.service.impl;

import com.lingnan.bean.User;
import com.lingnan.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/28.
 */

@Service
@WebService
public class UserServiceImpl implements IUserService{

    private Logger logger = Logger.getLogger(this.getClass());



    @Override
    public User login(@WebParam(name = "userName") String userName, @WebParam(name = "password") String password) {

        this.logger.info(userName + ": " + password);
        if (userName != null && userName.equals(password))
            return new User(userName, password, new Date(), true);

        return null;
    }
}
