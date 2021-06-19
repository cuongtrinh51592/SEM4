package com.example.aptech_trinhcaocuong_th1903013_iasf.repository;

import com.example.aptech_trinhcaocuong_th1903013_iasf.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {
}
