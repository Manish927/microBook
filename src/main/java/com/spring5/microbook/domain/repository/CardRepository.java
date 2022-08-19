package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Card;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface CardRepository extends ReactiveCrudRepository<Card, UUID> {
}
