package com.spring5.microbook.domain.controller;

import com.spring5.microbook.domain.model.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public interface AdderssApi {
    public Mono<ResponseEntity<Address>> createAddress(Mono<Address> addAddressReq,
                                                       ServerWebExchange exchange);
    public Mono<ResponseEntity<Void>> deleteAddress(String id, ServerWebExchange exchange);

    public Mono<ResponseEntity<Address>> getAddressById(String id, ServerWebExchange exchange);
}
