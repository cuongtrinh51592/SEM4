package com.example.exam_csw.service;

import com.example.exam_csw.entity.EmployeeEntity;
import com.example.exam_csw.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
        return employeeRepo.save(employeeEntity);
    }

    @Override
    public Iterable findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return employeeRepo.findById(Math.toIntExact(id));
    }
}
