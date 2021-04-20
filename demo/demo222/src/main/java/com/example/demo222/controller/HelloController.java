package com.example.demo222.controller;
 
 
import com.example.demo222.util.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
 
    @RequestMapping("/index")
    public String sayHello(){

        return "index";
    }

    @RequestMapping(value={"/redis"})
    @ResponseBody
    public String redis() {
        RedisUtil.redisPut("firstKey", "hello,redis!");
        return RedisUtil.redisGet("firstKey");
    }
}