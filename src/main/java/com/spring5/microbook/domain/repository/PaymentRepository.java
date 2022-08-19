package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Payment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface PaymentRepository extends ReactiveCrudRepository<Payment, UUID> {
}
