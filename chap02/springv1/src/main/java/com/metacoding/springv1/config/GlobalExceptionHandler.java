package com.metacoding.springv1.config;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class) 
    @ResponseBody
    public String myError(Exception e){

        return Script.back(e.getMessage());
    }

    @ExceptionHandler(Exception401.class)
    @ResponseBody
    public String handle401(Exception401 e) {
        return Script.href("/login-form", e.getMessage());
    }
}
