package com.practice.helloresponseentity.employee.service;

import com.practice.helloresponseentity.employee.dto.request.EmployeeRequestDto;
import com.practice.helloresponseentity.employee.entity.Employee;
import com.practice.helloresponseentity.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee getEmployee(final EmployeeRequestDto param){
        return null;
    }
}
