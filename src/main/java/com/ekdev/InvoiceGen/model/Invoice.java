package com.ekdev.InvoiceGen.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include // Only use id for equals/hashCode
    @ToString.Include         // Include id in toString
    private Long id;

    @Column(nullable = false)
    @ToString.Include
    private BigDecimal amount;

    @Column(nullable = false)
    @ToString.Include
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @ToString.Include
    private String pdfUrl;

    // A reference to the reservation for which this invoice was generated.
    // We store it as a simple identifier to keep the Invoice entity decoupled from the Reservation entity.
    @Column(nullable = false)
    @ToString.Include
    private Long reservationId;

    // Additional fields (like updatedAt) can be added as needed.
}
