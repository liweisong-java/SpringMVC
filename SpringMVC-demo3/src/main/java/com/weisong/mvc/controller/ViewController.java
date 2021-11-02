package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

/**
 * @author 李伟松
 * @create 2021-11-01-14:13
 */

@Controller
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("testForward")
    //转发/testThymeleafView，当控制器方法所设置的视图名称为redirect为前缀时，创建RedirectView视图，此时的视图名称不会被
    //S平日那个MVC配置文件种所配置的视图解析器解析，而是会将前缀redirext去掉，剩余部分作为最终路径通过重定向的方式跳转
    public String testForward(){
        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }

}
