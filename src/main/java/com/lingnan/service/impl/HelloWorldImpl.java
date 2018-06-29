package com.lingnan.service.impl;


import com.lingnan.service.IHelloWorld;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Service
public class HelloWorldImpl implements IHelloWorld {
    @Override
    public void sayHello(@WebParam String from) {

    }
}
