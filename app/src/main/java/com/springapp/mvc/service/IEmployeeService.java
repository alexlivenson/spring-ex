package com.springapp.mvc.service;

import com.springapp.mvc.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alexlivenson on 1/20/15.
 */
@Service("employeeService")
public interface IEmployeeService {
    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Employee findBySsn(String ssn);

    void updateEmployee(Employee employee);

}
