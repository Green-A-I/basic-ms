package com.myservice.firstproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BasicMSExceptionHandler {

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity<String> handleExp(ArithmeticException exception){
        return new ResponseEntity<>("ArithmeticException occured", HttpStatus.BAD_REQUEST);
    }
}
