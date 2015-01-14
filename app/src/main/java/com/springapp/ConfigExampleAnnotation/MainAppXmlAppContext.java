package com.springapp.ConfigExampleAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alexlivenson on 1/12/15.
 */
public class MainAppXmlAppContext {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        MessagePrinter messagePrinter = ctx.getBean(MessagePrinter.class);

        helloWorld.setMessage("Hello world!");
        helloWorld.getMessage();

        messagePrinter.printMessage();
    }
}
