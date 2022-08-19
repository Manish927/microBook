package com.spring5.microbook.domain.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface ScreenRepository extends ReactiveCrudRepository<ScreenRepository, UUID> {
}
