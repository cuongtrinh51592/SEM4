package com.example.assignment.repository;

import com.example.assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {
}
