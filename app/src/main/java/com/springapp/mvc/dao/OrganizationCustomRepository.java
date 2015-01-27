package com.springapp.mvc.dao;

import com.springapp.mvc.model.Organization;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by alexlivenson on 1/20/15.
 */
/*
 NOTE: Using anything that implements repository (Spring Data thing), you do not have to create an implementation of the
 interface. Spring creates a proxy and by convention knows implement your finder methods (i.e. findBy{class-property} or
 findBy{class-prop1}And{class-prop2}.
 */
// Base{Name} is standard in java industry, or can use Abstract
@Repository
public class OrganizationCustomRepository implements IOrganizationCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Organization find(Long id) {
        return entityManager.find(Organization.class, id);
    }


}

