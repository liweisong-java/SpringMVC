package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李伟松
 * @create 2021-11-02-18:17
 */
@Controller
public class JspController {
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
