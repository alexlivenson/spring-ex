package com.springapp.mvc.service;

import com.springapp.mvc.dao.IEmployeeDAO;
import com.springapp.mvc.model.Employee;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @InjectMocks // Instantiates testing objects and trie to inject fields annotated with @Mock or @Spy
    private EmployeeService employeeService;

    @Mock
    private IEmployeeDAO mockEmployeeDAO;

    private Employee employee1;
    private Employee employee2;


    @Before
    public void setUp() throws Exception {
        employeeService = new EmployeeService();
        employee1 = new Employee("Jim", "Bob");
        employee1 = new Employee("Sally", "Field");

        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMock() {

    }

    @Test
    public void shouldFindAllEmployees() {
        List list = new ArrayList();
        list.add(employee1);
        list.add(employee2);

        Mockito.when(mockEmployeeDAO.findAllEmployees()).thenReturn(list);
        assert employeeService.findAllEmployees().size() == 2;
    }

}