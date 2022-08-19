package com.spring5.microbook.domain.service;

import com.spring5.microbook.domain.model.Seat;
import com.spring5.microbook.domain.model.Theater;
import com.spring5.microbook.domain.repository.SeatRepository;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class SeatServiceImpl implements SeatService{

    SeatRepository repository;
    @Override
    public Flux<Seat> getAvailableSeats(Mono<Theater> theater) {
        repository.findAllById((Publisher<UUID>) theater.doOnNext(id -> id.getId()).subscribe());
        return null;
    }
}
