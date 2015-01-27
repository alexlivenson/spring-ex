package com.springapp.mvc.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by alexlivenson on 1/16/15.
 */
@Entity
@Table(name = "organization")
public class Organization extends AbstractPersistable<Long> {

    @Column(name = "name")
    private String name;
    @Column(name = "established")
    private String established;

    /**
     *
     */
    public Organization() {
        super();
    }

    public Organization(String name, String established) {
        this.name = name;
        this.established = established;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstablished() {
        return established;
    }

    public void setEstablished(String established) {
        this.established = established;
    }
}
