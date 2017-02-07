package com.kiranpariyar.springapp.dao;

import com.kiranpariyar.springapp.model.Employee;

import java.util.List;

/**
 * Created by kiranpariyar on 2/2/17.
 */
public interface EmployeeDao {
    Employee findById(int id);

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployee();
}
