package com.example.exam_csw.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EmployeeDto {

    private int id;
    @NotBlank(message = "Name not blank")
    private String name;

    @NotBlank(message = "Salary not blank")
    private double salary;
}
