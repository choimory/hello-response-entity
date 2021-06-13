package com.practice.helloresponseentity.employee.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class EmployeeRequestDto {
    private final Long employeeId;
}
