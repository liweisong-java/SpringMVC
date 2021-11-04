package com.weisong.rest.controller;

import com.weisong.rest.bean.Employee;
import com.weisong.rest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author 李伟松
 * @create 2021-11-03-17:56
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //获取员工集合
        Collection<Employee> employeeList = employeeDao.getAll();
        //想要在页面上访问需要把employeeList保存到域对象中
        model.addAttribute("employeeList",employeeList);
        return "employee_List";
    }
}
