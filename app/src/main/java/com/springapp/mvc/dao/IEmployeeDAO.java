package com.springapp.mvc.dao;

import com.springapp.mvc.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alexlivenson on 1/20/15.
 */
public interface IEmployeeDAO {
    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    void updateEmployee(Employee employee);

    Employee findBySsn(String ssn);
}
