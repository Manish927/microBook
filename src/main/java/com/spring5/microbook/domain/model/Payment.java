package com.spring5.microbook.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@Table
public class Payment {
    @Id
    private UUID id;

    private boolean authorized;
    private String message;
    private Booking bookingId;
}
