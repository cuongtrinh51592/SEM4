package com.example.aptech_trinhcaocuong_th1903013_iasf.controller;

import com.example.aptech_trinhcaocuong_th1903013_iasf.entity.EmployeeEntity;
import com.example.aptech_trinhcaocuong_th1903013_iasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/","index"})
    public String index(Model model) {
        List<EmployeeEntity> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping({"/create"})
    public String create(Model model, @RequestBody EmployeeEntity employeeEntity) {
        EmployeeEntity employees = employeeService.createEmployee(employeeEntity);
        model.addAttribute("employees", employees);
        return "create";
    }

    @PostMapping({"/save"})
    public String save(EmployeeEntity employeeEntity) {
        employeeService.saveEmployee(employeeEntity);
        return "redirect:/";
    }
}
