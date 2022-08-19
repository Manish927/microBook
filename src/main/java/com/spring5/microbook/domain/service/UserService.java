package com.spring5.microbook.domain.service;

import com.spring5.microbook.domain.model.Address;
import com.spring5.microbook.domain.model.Card;
import com.spring5.microbook.domain.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface UserService {
    Mono<Void> deleteCustomerById(String id);
    Mono<Void> deleteCustomerById(UUID id);
    Flux<Address> getAddressesByCustomerId(String id);
    Flux<User> getAllCustomers();
    Mono<Card> getCardByCustomerId(String id);
    Mono<User> getCustomerById(String id);
}
