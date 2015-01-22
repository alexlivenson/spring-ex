package com.springapp.mvc.service;

import com.springapp.mvc.dao.EmployeeDAO;
import com.springapp.mvc.dao.IEmployeeDAO;
import com.springapp.mvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by alexlivenson on 1/20/15.
 */
//@Service("employeeService") // Another way to do bean injection
@Service // Another way to do bean injection
@Transactional // wiil automatically wire transactionManager by Convention
public class EmployeeService implements IEmployeeService {

    // Spring injects by interface (Autowire by proxy). So using just EmployeeDAO would bomb spring. Need to use IEmployeeDOA. For specific
    // implementation of use qualifier @Qualifier -> name of bean
    @Autowired
    private IEmployeeDAO dao;

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
