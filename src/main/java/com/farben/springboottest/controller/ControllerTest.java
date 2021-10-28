package com.farben.springboottest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenXin
 * @date 2021/10/28 15:42
 */

@RestController
@RequestMapping("/hello")
public class ControllerTest {
    @RequestMapping("/world")
    public String test(){
        return "Hello world!";
    }
}
