package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 李伟松
 * @create 2021-10-27-9:58
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

//    @RequestMapping("/")
//    /**
//     * 需要保证在所有控制器中RequestMapping所能够匹配到的请求地址是唯一的
//     */
    public String index(){
        return "target";
    }

    @RequestMapping(
            value = {"/testRequestMapping","/test"},
            method = {RequestMethod.GET}
            )
    public String success(){
        return "success";
    }

    @RequestMapping(
            /**
             * value只要满足一个
            */
            value = "/testParamsAndHeaders",
            /**
             * params中的条件必须同时满足
            */
            params = {"username","password=123456"}
    )
    
    public String testParamsAndHeaders(){
        return "success";
    }

    @RequestMapping("/a?a/testAnt")
    /**
     * 浏览器发送的请求里？可以代表任意的单个字符
     * a?a是指a啥a都能匹配路径
     */
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/testPath/{id}")
    /**
     * 将占位符中的id表示的值自动赋值给形参id
     */
    public String testPath(@PathVariable("id")Integer id){
        System.out.println("id:" + id);
        return "success";
    }

}
