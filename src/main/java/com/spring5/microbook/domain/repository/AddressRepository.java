package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Address;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface AddressRepository extends ReactiveCrudRepository<Address, UUID> {
}
