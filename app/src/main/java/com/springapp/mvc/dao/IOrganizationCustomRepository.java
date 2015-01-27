package com.springapp.mvc.dao;

import com.springapp.mvc.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by alexlivenson on 1/20/15.
 */
/*
 NOTE: Using anything that implements repository (Spring Data thing), you do not have to create an implementation of the
 interface. Spring creates a proxy and by convention knows how implement your finder methods (i.e. findBy{class-property} or
 findBy{class-prop1}And{class-prop2}.
 */
public interface IOrganizationCustomRepository {

  public Organization find(Long id);

}
