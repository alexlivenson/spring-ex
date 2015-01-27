package com.springapp.mvc.dao;

import com.springapp.mvc.model.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alexlivenson on 1/20/15.
 */
@Repository // This is spring other way to find specialized beans
public class EmployeeDAO // extends AbstractDAO implements IEmployeeDAO
 {
    //NOTE: Session is inherited from base class which allows the DAO to get info
//    public void saveEmployee(Employee employee) {
//        persist(employee);
//    }
//
//    public List<Employee> findAllEmployees() {
//        Criteria criteria = getSession().createCriteria(Employee.class);
//        return (List<Employee>) criteria.list();
//    }
//
//    public void deleteEmployeeBySsn(String ssn) {
//        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
//        query.setString("ssn", ssn);
//        query.executeUpdate();
//    }
//
//    public void updateEmployee(Employee employee) {
//        getSession().update(employee);
//    }
//
//    public  Employee findBySsn(String ssn) {
//        Criteria criteria = getSession().createCriteria(Employee.class);
//        criteria.add(Restrictions.eq("ssn", ssn));
//        return (Employee) criteria.uniqueResult();
//    }
}
