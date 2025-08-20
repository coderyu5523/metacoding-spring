package com.metacoding.springv1._config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.metacoding.springv1._config.exception.Exception401;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(Exception401.class)
    public void ex401(Exception401 e) {
        System.out.println("401 에러 발생: " + e.getMessage());
    }
}
