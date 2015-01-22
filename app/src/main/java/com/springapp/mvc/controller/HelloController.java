package com.springapp.mvc.controller;

import com.springapp.mvc.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alexlivenson on 1/9/15.
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    IEmployeeService service;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world and Bye");
        System.out.println(service.findAllEmployees());
        return "hello";
    }
}
