package com.springapp.main;

import com.springapp.mvc.model.Employee;
import com.springapp.mvc.service.EmployeeService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alexlivenson on 1/20/15.
 */
public class MainWithHibernate {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

        EmployeeService service = (EmployeeService) context.getBean("employeeService");

        service.findAllEmployees();
    }
}
