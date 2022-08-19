package com.spring5.microbook.domain.service;

import com.spring5.microbook.domain.model.Address;
import com.spring5.microbook.domain.model.Card;
import com.spring5.microbook.domain.model.User;
import com.spring5.microbook.domain.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Void> deleteCustomerById(String id) {
        return deleteCustomerById(UUID.fromString(id));
    }

    @Override
    public Mono<Void> deleteCustomerById(UUID id) {
        return repository.deleteById(id).then();
    }

    @Override
    public Flux<Address> getAddressesByCustomerId(String id) {
        return repository.getAddressesByCustomerId(id);
    }

    @Override
    public Flux<User> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Mono<Card> getCardByCustomerId(String id) {
        return repository.findCardByCustomerId(id);
    }

    @Override
    public Mono<User> getCustomerById(String id) {
        return repository.findById(UUID.fromString(id));
    }
    
}
