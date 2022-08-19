package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Booking;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface BookingRepository extends ReactiveCrudRepository<Booking, UUID> {
}
