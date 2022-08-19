package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Seat;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface SeatRepository extends ReactiveCrudRepository<Seat, UUID> {
}
