package com.ekdev.InvoiceGen.exception;

import com.ekdev.InvoiceGen.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {


    // Fallback for all other exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGeneralException(Exception ex) {
        ErrorResponseDto error = new ErrorResponseDto(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Internal Server Error",
                ex.getMessage(),
                "INTERNAL_ERROR",
                LocalDateTime.now().toString()
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
