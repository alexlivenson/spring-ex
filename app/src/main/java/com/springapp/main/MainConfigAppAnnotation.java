package com.springapp.main;

import com.springapp.config.BaseConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by alexlivenson on 1/13/15.
 */
public class MainConfigAppAnnotation {

    public static void main(String args[]) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BaseConfig.class);
        MessagePrinter mp = ctx.getBean(MessagePrinter.class);

        mp.printMessage();
    }
}
