package com.kiranpariyar.springapp.controller;

import com.kiranpariyar.springapp.model.Employee;
import com.kiranpariyar.springapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello",HttpStatus.OK);
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id){
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            System.out.println("Employee with id " + id + " not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @RequestMapping(value = "/employee/",method = RequestMethod.POST)
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        System.out.print("Inside create employee method");
        employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/employees",method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getAllEmployee(){
        System.out.print("Inside list all employees");
        return new ResponseEntity<>(employeeService.findAllEmployee(),HttpStatus.OK);
    }
}
