package com.practice.helloresponseentity.employee.service;

import com.practice.helloresponseentity.common.exception.custom.CommonCustomException;
import com.practice.helloresponseentity.common.response.code.CommonResponseCode;
import com.practice.helloresponseentity.employee.dto.request.EmployeeRequestDto;
import com.practice.helloresponseentity.employee.dto.response.EmployeeResponseDto;
import com.practice.helloresponseentity.employee.entity.Employee;
import com.practice.helloresponseentity.employee.mapper.EmployeeMapper;
import com.practice.helloresponseentity.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeResponseDto getEmployee(final EmployeeRequestDto param){
        return employeeMapper.toDto(employeeRepository.findById(param.getEmployeeId())
                                                        .orElseThrow(() -> new CommonCustomException(CommonResponseCode.EMPTY.getCode(), CommonResponseCode.EMPTY.getMessage())));
    }
}
