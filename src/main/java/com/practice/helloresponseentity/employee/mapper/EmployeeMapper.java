package com.practice.helloresponseentity.employee.mapper;

import com.practice.helloresponseentity.employee.dto.response.EmployeeResponseDto;
import com.practice.helloresponseentity.employee.entity.Employee;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface EmployeeMapper {
    EmployeeResponseDto toDto(Employee entity);
}
