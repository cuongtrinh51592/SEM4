package com.example.exam_csw.service;

import com.example.exam_csw.entity.EmployeeEntity;

import java.util.Optional;

public interface EmployeeService<T> {
    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);
    Iterable<T> findAll();
    Optional<T> findById(Long id);
}
