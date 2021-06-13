package com.practice.helloresponseentity.employee.dto.response;

import com.practice.helloresponseentity.common.code.GenderCode;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {
    private Long employeeId;
    private String name;
    private GenderCode gender;
    private Integer age;
    private String address;
}
