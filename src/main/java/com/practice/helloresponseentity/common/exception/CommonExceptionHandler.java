package com.practice.helloresponseentity.common.exception;

import com.practice.helloresponseentity.common.exception.custom.CommonCustomException;
import com.practice.helloresponseentity.common.response.code.CommonResponseCode;
import com.practice.helloresponseentity.common.response.dto.CommonResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("com.practice.helloresponseentity")
public class CommonExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<CommonResponseDto<?>> internalServerError(Exception e){
        e.printStackTrace();
        return new ResponseEntity<>(CommonResponseDto.builder()
                                                        .statusCode(CommonResponseCode.INTERNAL_SERVER_ERROR.getCode())
                                                        .statusMessage(CommonResponseCode.INTERNAL_SERVER_ERROR.getMessage())
                                                        .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({CommonCustomException.class})
    public ResponseEntity<CommonResponseDto<?>> customException(CommonCustomException e){
        return ResponseEntity.ok(CommonResponseDto.builder()
                                                    .statusCode(e.getCode())
                                                    .statusMessage(e.getMessage())
                                                    .build());
    }
}
