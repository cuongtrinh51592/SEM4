package com.example.assignment.service;

import com.example.assignment.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
//    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    void deleteEmployeeById(Integer id);
    Page<Employee> findPaginated(Integer pageNo, Integer pageSize );
}
