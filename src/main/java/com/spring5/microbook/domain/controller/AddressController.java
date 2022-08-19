package com.spring5.microbook.domain.controller;

import com.spring5.microbook.domain.model.Address;
import com.spring5.microbook.domain.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.status;

@RestController
public class AddressController implements AdderssApi {

    AddressService service;

    AddressController(AddressService service) {
        this.service = service;
    }
    @Override
    public Mono<ResponseEntity<Address>> createAddress(Mono<Address> addAddressReq, ServerWebExchange exchange) {
        return service.createAddress(addAddressReq).map(ex -> status(HttpStatus.CREATED).body(ex));
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteAddress(String id, ServerWebExchange exchange) {
        return service.getAddressesById(id).flatMap(a -> service.deleteAddressesById(a.getUserId()).then(Mono.just(status(HttpStatus.ACCEPTED).<Void>build()))).switchIfEmpty(Mono.just(notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<Address>> getAddressById(String id, ServerWebExchange exchange) {
        return service.getAddressesById(id).map(ResponseEntity::ok).defaultIfEmpty(notFound().build());
    }
}
