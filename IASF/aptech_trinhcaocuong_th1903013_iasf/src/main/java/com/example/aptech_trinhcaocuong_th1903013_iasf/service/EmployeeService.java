package com.example.aptech_trinhcaocuong_th1903013_iasf.service;

import com.example.aptech_trinhcaocuong_th1903013_iasf.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployees();
    EmployeeEntity createEmployee(EmployeeEntity employeeEntity);
    void saveEmployee(EmployeeEntity employeeEntity);
}
