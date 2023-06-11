package org.example.spring.mvc_hibernate_aop.dao;

import org.example.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeDAOimpl implements EmployeeDAO{
    @Autowired
   private SessionFactory sessionFactory;
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session =sessionFactory.getCurrentSession();
//        List<Employee> allEmployees=session.createQuery("from Employee ",
//                        Employee.class).getResultList();
        Query <Employee>query =session.createQuery("from Employee ",Employee.class);
        List<Employee>allEmployees=query.getResultList();
        return null;
    }
}