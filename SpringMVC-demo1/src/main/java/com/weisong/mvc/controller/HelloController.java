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

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
/**
 * 总结：
 *          1、创建Maven工程 添加web模块，添加依赖，配置web.xml，配置前端控制器
 *          2、创建请求控制器，配置SpringMVC配置文件
 *          3、扫描组件，配置视图解析器，（可以处理当前请求了）
 *
 *        SpringMVC运行的简单总结：
 *
 *        SpringMVC如何处理请求的：
 *          浏览器发送请求到服务器，需要先被前端控制器的url-pattern进行匹配，
 *              如果当前请求能够符合url-pattern（除了jsp匹配不了都能够匹配），
 *          会被当前前端控制器DispatcherServlet进行处理
 *          处理完成后会读取SpringMVC的核心配置文件通过扫描组件找到控制器，
 *          将请求地址和控制器中的@RequestMapping的value属性值进行匹配
 *          （没有注解没有办法找到控制器方法，@RequestMapping叫做请求映射，作用：将请求和控制器方法创建映射关系，
 *          怎么创建:
 *              value属性值要和当前请求地址保持一致
 *          ）
 *          如果一致，当前注解所标识的方法就是处理请求的方法，而这个方法会产生一个字符串类型的视图名称，
 *          这个视图名称会被视图见习期解析，加上前缀和后缀组成的最终路径就是要跳转到的页面路径，
 *          而且最终跳转最终路径的方式是转发，
 *
 */