package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李伟松
 * @create 2021-10-26-17:43
 */
@Controller
public class TestController {

    @RequestMapping("/")
    /**
     * 浏览器请求发送到服务器，被DispatcherServlet处理之后通过RequestMapping找到到控制器方法
     * 请求映射
     */


    public String index(){
        return "index";
    }

    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }

}
