package com.springapp.mvc.domain;

import com.springapp.mvc.model.Person;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by alexlivenson on 1/15/15.
 */
// NOTE: DAO pattern is considered as an anti pattern for the reason that the DAO objects are anemic. Revisit
public class PersonDAO implements IPersonDAO {

    @Override
    public void savePersion() {

    }

    @Override
    public List<Person> list() {
        return null;
    }
}
