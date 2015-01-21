package com.springapp.mvc.service;

import com.springapp.mvc.dao.EmployeeDAO;
import com.springapp.mvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by alexlivenson on 1/20/15.
 */
public class EmployeeService implements IEmployeeService {

    // @Repository keyword autowires
    @Autowired
    private EmployeeDAO dao;

    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }

    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }

    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }

    public Employee findBySsn(String ssn) {
        return dao.findBySsn(ssn);
    }

    public void updateEmployee(Employee employee) {

    }
}
