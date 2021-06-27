package com.practice.helloresponseentity.employee.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class EmployeeRequestDto {
    private final Long employeeId; //직원 고유번호
    private final Long employeeAgeFrom; //직원나이 범위검색 최소값
    private final Long employeeAgeTo; //직원나이 범위검색 최대값
}
