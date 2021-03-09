package com.killserver1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControllerDemo {

    @Autowired
    RedisTemplate redisTemplate;
    @RequestMapping("/index")
    public String app(HttpServletRequest request){
        return "index";
    }
}
