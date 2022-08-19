package com.spring5.microbook.domain.repository;


import com.spring5.microbook.domain.model.Address;
import com.spring5.microbook.domain.model.Card;
import com.spring5.microbook.domain.model.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface  UserRepository extends ReactiveCrudRepository<User, UUID> {
    @Query("SELECT Address FROM User WHERE id = :id")
    Flux<Address> getAddressesByCustomerId(String id);

    @Query("SELECT Card FROM User WHERE id =:id")
    Mono<Card> findCardByCustomerId(String id);
}
