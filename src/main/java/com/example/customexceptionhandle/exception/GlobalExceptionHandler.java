package com.example.customexceptionhandle.exception;

import com.example.customexceptionhandle.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private ResponseEntity<Object> buildResponseEntity(String errorCode, String errorMessage, HttpStatus httpStatus) {
        ErrorResponseDto error = ErrorResponseDto.builder()
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .httpStatus(httpStatus.getReasonPhrase())
                .httpStatusCode(httpStatus.value())
                .build();
        return new ResponseEntity<>(error, httpStatus);
    }

    @ExceptionHandler(value = WrongInputException.class)
    public ResponseEntity<Object> exception(WrongInputException wrongInputException){
        return buildResponseEntity("001", "Invalid input", HttpStatus.BAD_REQUEST);
    }
}
