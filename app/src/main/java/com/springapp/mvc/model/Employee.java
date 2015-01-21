package com.springapp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by alexlivenson on 1/16/15.
 */
@Entity
public class Employee {

    @Id
    private long id;

    private String firstName;
    private String lastName;

    @Column
    private String ssn;

    // This constructor is needed for hibernate
    protected Employee(){}

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

}
