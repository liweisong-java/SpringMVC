package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 李伟松
 * @create 2021-10-28-12:07
 */
@Controller
public class ParamController {
    /**
     *
     * @param request
     * @return
     */
    @RequestMapping("/testServletAPI")
    //形参位置的request标识当前请求                请求对象
    public String testServletAPI(HttpServletRequest request){
        /**
         * 那我们能直接使用request。
         * 访问这个方法就会创建Session
         * Cookie是会话技术，默认的周期就是浏览器开启到浏览器关闭，只要浏览器不关闭Cookie将一直存在  
         *
         */
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ",password" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    //若请求参数中出现多个同名的请求参数，可以再控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
    //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
    public String testParam(
            //required=false 不必需要传 默认值为true       defaultValue不传的时候是hehe,
            @RequestParam(value = "user_name",required = false,defaultValue = "hehe") String username,
            String password,
            String[] hobby){
        System.out.println("username:" + username + ",password" + password + ",hobby" + hobby);
        return "success";
    }
}
