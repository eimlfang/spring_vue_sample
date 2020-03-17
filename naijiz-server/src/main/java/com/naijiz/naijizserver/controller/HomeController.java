package com.naijiz.naijizserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eimlfang
 * @create 2020/3/17 3:20 下午
 */
@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("index")
    public String index() {
        return "/index";
    }

    @RequestMapping("/hello")
    public String home() {
        return "hello from server";
    }
}
