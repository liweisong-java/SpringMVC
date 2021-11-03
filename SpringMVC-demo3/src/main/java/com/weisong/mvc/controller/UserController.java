package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 李伟松
 * @create 2021-11-03-11:59
 */
@Controller
public class UserController {
    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /users    GET请求      查询所有用户信息
     * /user/1   GET请求       根据用户id查询用户信息
     * /user     POST请求      添加用户信息
     * /user/1   DELETE请求    删除用户信息
     * /user     PUT请求       修改(更新)用户信息
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据用户id查询用户信息");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(String username,String password){
        System.out.println("添加用户信息:" + username + "," + password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改用户信息:" + username + "," + password);
        return "success";
    }

}
