package com.kiranpariyar.springapp.service;

import com.kiranpariyar.springapp.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployee();
}
