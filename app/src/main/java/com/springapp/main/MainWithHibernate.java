package com.springapp.main;

import com.springapp.mvc.dao.IEmployeeDAO;
import com.springapp.mvc.model.Employee;
import com.springapp.mvc.service.EmployeeService;
import com.springapp.mvc.service.IEmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alexlivenson on 1/20/15.
 */
public class MainWithHibernate {

    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext(IEmployeeDAO.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
//        EmployeeService service = context.getBean(EmployeeService.class);
        IEmployeeService service = context.getBean(IEmployeeService.class);
//
//
//        service.findAllEmployees();
//        System.out.println(service.findAllEmployees());

        service.findAllEmployees();
        System.out.println(service.findAllEmployees());
    }
}
