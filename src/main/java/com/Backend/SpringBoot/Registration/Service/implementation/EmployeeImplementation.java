package com.Backend.SpringBoot.Registration.Service.implementation;

import com.Backend.SpringBoot.Registration.Dto.EmployeeDTO;
import com.Backend.SpringBoot.Registration.Entity.Employee;
import com.Backend.SpringBoot.Registration.Repo.EmployeeRepo;
import com.Backend.SpringBoot.Registration.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EmployeeImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    private PasswordEncoder passwordEncoder;
    //new employees will be saved in the employeeRepo repository
    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(

                employeeDTO.getEmployeeId(),
                employeeDTO.getEmployeeName(),
                employeeDTO.getEmail(),

                this.passwordEncoder.encode(employeeDTO.getPassword())
        );

employeeRepo.save(employee);

return employee.getEmployeeName();

    }
}