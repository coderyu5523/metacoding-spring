package com.metacoding.springv1.config;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class) 
    @ResponseBody
    public String myHandler(Exception e){
        return Script.alertBack(e.getMessage());
    }

    @ExceptionHandler(Exception401.class)
    @ResponseBody
    public String myHandler401(Exception401 e) {
        //return Script.alert(e.getMessage());
        //return Script.alertHref("/login-form", e.getMessage());
        return Script.href("/login-form");
    }
}
