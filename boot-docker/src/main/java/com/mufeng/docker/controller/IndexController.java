package com.mufeng.docker.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/6/9 11:06
 */
@RestController
@Log4j
public class IndexController {
    @RequestMapping("index")
    public String index(){
        log.info("This is new World!");
        return "Welcome to the world";
    }
}
