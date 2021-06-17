package com.example.exam_csw.controller;

import com.example.exam_csw.dto.EmployeeDto;
import com.example.exam_csw.dto.MapperDto;
import com.example.exam_csw.entity.EmployeeEntity;
import com.example.exam_csw.model.BaseResponse;
import com.example.exam_csw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    MapperDto mapperDto;

    @GetMapping
    private List<EmployeeEntity> getEmployees() {
        List<EmployeeEntity> list = (List<EmployeeEntity>) employeeService.findAll();
        return list;
    }

    @PostMapping
    private ResponseEntity addEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
        BaseResponse res = new BaseResponse();
        EmployeeEntity employeeEntity = mapperDto.convertToEntity(employeeDto);
        res.data = employeeService.addEmployee(employeeEntity);
        return ResponseEntity.ok(res);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity employeeEntity) {
        Optional<EmployeeEntity> categoryOptional = employeeService.findById(id);
        return categoryOptional.map(category1 -> {
            employeeEntity.setId(category1.getId());
            return new ResponseEntity<>(employeeService.addEmployee(employeeEntity), HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
