package com.aplombee.apps.productsmgt.controller;

import com.aplombee.apps.productsmgt.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleProductNotFound(ProductNotFoundException e){
        return e.getMessage();
    }

}
