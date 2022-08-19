package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Booking;
import com.spring5.microbook.domain.model.Card;
import com.spring5.microbook.domain.model.Payment;
import com.spring5.microbook.domain.model.Seat;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.r2dbc.core.Parameter;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

@Repository
public class BookingRepositoryExtImpl implements BookingRepositoryExt {

    private ConnectionFactory connectionFactory;
    private DatabaseClient dbClient;
    private AddressRepository addressRepo;
    private CardRepository cardRepo;
    private PaymentRepository paymentRep;

    @Override
    public Mono<Booking> insert(Mono<Payment> paymentMono) {

        R2dbcEntityTemplate template = new R2dbcEntityTemplate(connectionFactory);

        AtomicReference<UUID> id = new AtomicReference<>();

        Mono<List<Seat>> seatLists = paymentMono.flatMap(m -> paymentRep.findAllById(m.getId()).collectList().cache());


        //paymentMono.flatMap(pe -> dbClient.sql(""" INSERT INTO payment(id, authorized, message, bookingId )
                                                VALUES($1, $2, $3, $4).bind"$1", Parameter.fromOrEmpty(paymentMono.getId()...)"""));
        return null;
    }

    @Override
    public Mono<Booking> updateMapping(Payment payment) {
        return paymentRep.saveAll();
    }
}
