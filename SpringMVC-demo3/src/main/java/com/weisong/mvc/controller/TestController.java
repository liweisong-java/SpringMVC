package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;

/**
 * @author 李伟松
 * @create 2021-10-31-18:15
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
