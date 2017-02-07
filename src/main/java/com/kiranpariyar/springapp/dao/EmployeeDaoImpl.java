package com.kiranpariyar.springapp.dao;

import com.kiranpariyar.springapp.model.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kiranpariyar on 2/2/17.
 */

@Repository("EmployeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {

    @Override
    public Employee findById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        persist(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        Criteria criteria = createEntityCriteria();
        return (List<Employee>) criteria.list();
    }

}
