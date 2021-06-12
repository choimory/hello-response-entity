package com.practice.helloresponseentity.employee;

import com.practice.helloresponseentity.common.response.code.CommonResponseCode;
import com.practice.helloresponseentity.common.response.util.CommonResponseData;
import com.practice.helloresponseentity.employee.dto.request.EmployeeRequestDto;
import com.practice.helloresponseentity.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public ResponseEntity<CommonResponseData> getEmployee(@PathVariable final Long employeeId){
        return new ResponseEntity<>(CommonResponseData.builder()
                                                        //@Builder.default 및 기본값 초기화 해놨으므로 OK일시엔 생략
                                                        //.statusCode(CommonResponseCode.OK.getCode())
                                                        //.statusMessage(CommonResponseCode.OK.getMessage())
                                                        .data(employeeService.getEmployee(EmployeeRequestDto.builder()
                                                                                                            .employeeId(employeeId)
                                                                                                            .build()))
                                                        .build(), HttpStatus.OK);
    }
}