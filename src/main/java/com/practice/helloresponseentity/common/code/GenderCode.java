package com.practice.helloresponseentity.common.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderCode {
    MALE("남자"), FEMALE("여자");

    private final String value;
}
