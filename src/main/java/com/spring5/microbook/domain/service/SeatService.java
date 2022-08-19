package com.spring5.microbook.domain.service;

import com.spring5.microbook.domain.model.Seat;
import com.spring5.microbook.domain.model.Theater;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SeatService {
    Flux<Seat> getAvailableSeats(Mono<Theater> theater);
}
