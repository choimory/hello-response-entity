package com.practice.helloresponseentity.common.response.dto;

import com.practice.helloresponseentity.common.response.code.CommonResponseCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponseDto<T> {
    @Builder.Default
    private final Integer statusCode = CommonResponseCode.OK.getCode();
    @Builder.Default
    private final String statusMessage = CommonResponseCode.OK.getMessage();
    private T data;
}
