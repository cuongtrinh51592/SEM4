package com.example.exam_csw.dto;

import com.example.exam_csw.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {

    EmployeeEntity convertToEntity(EmployeeDto employeeDto);
    EmployeeDto convertToDto(EmployeeEntity employeeEntity);

}
