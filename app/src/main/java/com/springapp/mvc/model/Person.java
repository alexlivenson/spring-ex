package com.springapp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by alexlivenson on 1/16/15.
 */
@Entity
@Table(name="person")
public class Person {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public void setId() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
