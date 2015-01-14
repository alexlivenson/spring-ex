package com.springapp.ConfigExampleAnnotation;

/**
 * Created by alexlivenson on 1/13/15.
 */
public class MessagePrinter {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }

    // Need empty constructor in order to make it a been
    public MessagePrinter() {

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message : " + message);
    }
}
