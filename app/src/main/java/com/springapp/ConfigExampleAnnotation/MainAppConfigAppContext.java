package com.springapp.ConfigExampleAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by alexlivenson on 1/13/15.
 */
public class MainAppConfigAppContext {

//    @Autowired
//    public MessagePrinter mp;

    public static void main(String args[]) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BaseConfig.class);
        MessagePrinter mp = ctx.getBean(MessagePrinter.class);

        mp.printMessage();
    }
}
