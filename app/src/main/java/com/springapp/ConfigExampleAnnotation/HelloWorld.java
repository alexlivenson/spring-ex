package com.springapp.ConfigExampleAnnotation;

/**
 * Created by alexlivenson on 1/12/15.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message : " + message);
    }
}
