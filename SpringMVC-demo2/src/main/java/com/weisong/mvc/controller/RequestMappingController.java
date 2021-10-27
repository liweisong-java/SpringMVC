package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李伟松
 * @create 2021-10-27-9:58
 */
@Controller
@RequestMapping("/hello")
public class RequestMappingController {

//    @RequestMapping("/")
//    /**
//     * 需要保证在所有控制器中RequestMapping所能够匹配到的请求地址是唯一的
//     */
//    public String index(){
//        return "target";
//    }

    @RequestMapping("/testRequestMapping")
    public String success(){
        return "success";
    }


}
