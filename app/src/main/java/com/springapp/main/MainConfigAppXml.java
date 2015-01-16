package com.springapp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alexlivenson on 1/12/15.
 */
public class MainConfigAppXml {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        MessagePrinter messagePrinter = ctx.getBean(MessagePrinter.class);

        helloWorld.getMessage();
        helloWorld.setMessage("Set Message printer values");
        helloWorld.getMessage();

        messagePrinter.printMessage();
    }
}
