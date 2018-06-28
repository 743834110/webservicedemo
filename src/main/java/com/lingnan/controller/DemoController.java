package com.lingnan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/28.
 */

@Controller
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("demo")
    public String demo(){
        return "demo";
    }
}
