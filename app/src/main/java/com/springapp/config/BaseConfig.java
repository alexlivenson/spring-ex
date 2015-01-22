package com.springapp.config;

import com.springapp.main.HelloWorld;
import com.springapp.main.MessagePrinter;
import org.springframework.context.annotation.Bean;


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
