package com.springapp.main;

import com.springapp.mvc.service.IEmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alexlivenson on 1/20/15.
 */
public class MainWithHibernate {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
        IEmployeeService service = context.getBean(IEmployeeService.class);

        service.findAllEmployees();
        System.out.println(service.findAllEmployees());
    }
}
