package com.gs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/9/7.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    /**
     * 默认使用get请求方式
     * @return
     */
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String hello() {

        return "hello";
    }

    @RequestMapping("hi")
    public String hi() {

        return "hi";
    }
}
