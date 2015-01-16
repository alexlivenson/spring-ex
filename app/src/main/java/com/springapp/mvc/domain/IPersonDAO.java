package com.springapp.mvc.domain;

import com.springapp.mvc.model.Person;

import java.util.List;

/**
 * Created by alexlivenson on 1/15/15.
 */
public interface IPersonDAO {
    public void savePersion();

    public List<Person> list();
}
