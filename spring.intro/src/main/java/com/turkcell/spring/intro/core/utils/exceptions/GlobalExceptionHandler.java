package com.turkcell.spring.intro.core.utils.exceptions;


import com.turkcell.spring.intro.core.utils.exceptions.types.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({BusinessException.class})//not instance ,send type
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleRunTimeException(BusinessException exception){
        return exception.getMessage();
    }


    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handleValidationException(MethodArgumentNotValidException exception)
    {
        Map<String,String> errors=new HashMap<>();
        for(FieldError error: exception.getBindingResult().getFieldErrors())
        {
            errors.put(error.getField(),error.getDefaultMessage());
        }

        return errors;
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String HandleException(Exception exception)
    {
        return "Unknown mistake!";
    }
}
