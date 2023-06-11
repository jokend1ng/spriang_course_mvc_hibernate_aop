package org.example.spring.mvc_hibernate_aop.Service;

import org.example.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmloyee(int id);
    public void deleteEmployee(int id);
}
