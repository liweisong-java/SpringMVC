package com.weisong.rest.controller;

import com.weisong.rest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 李伟松
 * @create 2021-11-03-17:56
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
}
