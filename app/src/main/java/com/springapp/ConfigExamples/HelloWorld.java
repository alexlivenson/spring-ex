package com.springapp.ConfigExamples;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alexlivenson on 1/12/15.
 */
public class HelloWorld {
    private String message;
    @Autowired
    MessagePrinter messagePrinter;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message : " + message);
    }

    public void setMessagePrinter(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }
}
