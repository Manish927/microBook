package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@Table
public class Booking {
    @Id
    private UUID id;

    private UUID userId;
    private UUID addressId;
    private UUID cardId;

    private Timestamp bookingDate;

    private UUID paymentId;

    private Address address;
    private Payment payment;
    private Card card;
}
