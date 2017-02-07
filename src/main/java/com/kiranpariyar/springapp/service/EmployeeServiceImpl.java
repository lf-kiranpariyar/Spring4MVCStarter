package com.kiranpariyar.springapp.service;

import com.kiranpariyar.springapp.dao.EmployeeDao;
import com.kiranpariyar.springapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public Employee findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return dao.findAllEmployee();
    }
}
