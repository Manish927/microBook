package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Booking;
import com.spring5.microbook.domain.model.Payment;
import reactor.core.publisher.Mono;

public interface BookingRepositoryExt {

    Mono<Booking> insert(Mono<Payment> paymentMono);
    Mono<Booking> updateMapping(Payment payment);
}
