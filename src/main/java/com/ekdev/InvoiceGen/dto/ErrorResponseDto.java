package com.ekdev.InvoiceGen.dto;

public record ErrorResponseDto (
        int status,
        String error,
        String message,
        String errorCode,
        String timestamp
) {
}
