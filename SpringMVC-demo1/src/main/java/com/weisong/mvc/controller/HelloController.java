package com.weisong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端控制器的作用是把浏览器发送的请求进行统一的处理
 *
 * 不同的请求应该有不同的处理过程：获取的请求参数不一样，往域对象放值不一样......
 *
 *
 * 创建控制器：就是一个类，类中的方法才是最终来处理请求的过程
 *      跟Servlet不一样，因为我们需要的数据已经在前端控制器已经获取过了，
 *      我们只需要创建方法然后通过SpringMVC的方式匹配到方法，这个方法就是处理请求的方法
 *
 *  Servlet创建的时候我们需要让他实现servlet接口，或者让他去继承HttpServlet
 *  SpringMVC用来处理请求的控制器：就是一个pojo
 *
 *  不需要继承，也不需要实现，但是需要通过注解进行标识，
 *  通过扫描SpringMVC才知道这个类是一个控制器，
 *  才可以将这个类中的方法来作为控制器方法处理当前的请求和响应
 * @author 李伟松
 * @create 2021-10-26-10:51
 */

/**
 * 两种方式：bean标签 -- 注解 + 扫描
 * 注解 + 扫描：
 *          @Component：将当前类标识为一个普通组件
 *          @Controller：标识为一个控制型组件
 *          @Service：标识为一个业务型组件
 *          @Repository：标识为持久层组件
 *
 *          在springMVC.xml中扫描组件
 */
@Controller
public class HelloController {

    /*
    控制器里的方法才是真正处理请求的方法，创建一个方法
     */
    //请求映射的注解
    @RequestMapping("/")
    public String index(){
        //返回视图名称：视图名称就决定了要跳转的页面，因为当前的html时没办法直接访问的，
        // 所以最终跳转到哪个页面时从视图名称决定，
        // 当我们返回一个视图名称，就会被视图解析器进行解析
        return "index";

    }
}
