package com.springapp.mvc.DAO;

import com.springapp.config.TestAppConfig;
import com.springapp.mvc.dao.IOrganizationCustomRepository;
import com.springapp.mvc.dao.IOrganizationRepository;
import com.springapp.mvc.model.Organization;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestAppConfig.class)
public class OrganizationIntegrationTest {

    // EnableJpaRepositories("com.springapp.mvc.dao") helps find the repo
    @Autowired
    IOrganizationRepository repository;
    @Autowired
    IOrganizationCustomRepository customRepository;

    @Test
    public void sampleTestCase() {

        Organization test = customRepository.find(Long.valueOf(1));
        System.out.println(test);

        Organization org = new Organization("samsung", "1956");
        org = repository.save(org);

        Organization org2 = new Organization("rei", "2000");
        org2 = repository.save(org2);

        List<Organization> result = repository.findByName("samsung");
        assert result.size() == 1;
        assert result.contains(org);
    }
}