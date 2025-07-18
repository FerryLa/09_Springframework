package com.ohgiraffers.restapi.section02.responseentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@Getter
@ToString
public class ResponseMessage {

    private int httpStatus;
    private String message;
    private Map<String, Object> results;
}
