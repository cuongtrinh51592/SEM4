package com.example.aptech_trinhcaocuong_th1903013_iasf.service;

import com.example.aptech_trinhcaocuong_th1903013_iasf.entity.EmployeeEntity;
import com.example.aptech_trinhcaocuong_th1903013_iasf.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return (List<EmployeeEntity>) employeeRepo.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepo.save(employeeEntity);
    }

    @Override
    public void saveEmployee(EmployeeEntity employeeEntity) {
        employeeRepo.save(employeeEntity);
    }
}
