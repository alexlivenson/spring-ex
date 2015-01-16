package com.springapp.ConfigExamples;

import org.springframework.context.annotation.Bean;
import sun.jvm.hotspot.HelloWorld;

/**
 * Created by alexlivenson on 1/12/15.
 */
public class BaseConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public MessagePrinter messagePrinter() {
        return new MessagePrinter("This is my message");
    }

}
