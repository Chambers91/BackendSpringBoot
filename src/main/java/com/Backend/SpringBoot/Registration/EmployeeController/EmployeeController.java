package com.Backend.SpringBoot.Registration.EmployeeController;

import com.Backend.SpringBoot.Registration.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Backend.SpringBoot.Registration.Dto.EmployeeDTO;
@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
     String id = employeeService.addEmployee(employeeDTO);
     return id;
    }
}
