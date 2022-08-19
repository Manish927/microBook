package com.spring5.microbook.domain.service;

import com.spring5.microbook.domain.model.Address;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface AddressService {

    Mono<Address> createAddress(Mono<Address> addressReq);
    Mono<Void> deleteAddressesById(String id);
    Mono<Void> deleteAddressesById(UUID id);
    Mono<Address> getAddressesById(String id);
    Flux<Address> getAllAddresses();
}
