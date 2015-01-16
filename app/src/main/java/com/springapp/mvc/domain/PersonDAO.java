package com.springapp.mvc.domain;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by alexlivenson on 1/15/15.
 */
// NOTE: DAO pattern is considered as an anti pattern for the reason that the DAO objects are anemic. Revisit
@Entity
@Table(name="person")
public class PersonDAO {
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
