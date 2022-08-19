package com.spring5.microbook.domain.service;

import com.spring5.microbook.domain.model.Movie;
import com.spring5.microbook.domain.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class MovieService {

    private static final Logger log =  Logger.getLogger(MovieService.class.getName());
    MovieRepository movieRepository;

    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    public Flux<Movie> findAll () {
        return movieRepository.findAll();
    }

    public Mono<Movie> findById(UUID id) {
        return movieRepository.findById(UUID.fromString(String.valueOf(id)));
    }

    public void insertDemoData() {
        /*String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        //Movie movie = Movie.builder().duration(Duration.ofHours(2)).date_of_release(simpleDateFormat.format(new Date())).name("manish1").build();

        Movie movie = new Movie(1, "manish1", simpleDateFormat.format(new Date()),Duration.ofHours(2) );
        movieRepository.save(movie);*/


        Flux<Movie> movies = Flux
                .just("manish1", "manish2", "manish3", "manish4")
                .map(name -> new Movie(null, name))
                .flatMap(this.movieRepository::save);       //.flatMapSequential()

        this.movieRepository
                .deleteAll()
                .thenMany(movies)
                .thenMany(this.movieRepository.findAll());
                //.subscribe(log::info);

    }
}
