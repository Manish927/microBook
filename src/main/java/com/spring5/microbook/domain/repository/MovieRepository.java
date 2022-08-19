package com.spring5.microbook.domain.repository;

import com.spring5.microbook.domain.model.Movie;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface MovieRepository extends ReactiveCrudRepository<Movie, UUID> {

}
