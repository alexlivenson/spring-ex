package com.springapp.main;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alexlivenson on 1/12/15.
 */
public class HelloWorld {

    @Autowired
    MessagePrinter messagePrinter;

    public void setMessage(String message) {
        messagePrinter.setMessage(message);
    }

    public void getMessage() {
        messagePrinter.printMessage();
    }

    // MessagePrinter is automatically inject when the bean is loaded
    public void setMessagePrinter(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

}
