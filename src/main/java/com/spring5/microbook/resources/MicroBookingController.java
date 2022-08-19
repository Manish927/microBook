package com.spring5.microbook.resources;


import com.spring5.microbook.domain.model.Movie;
import com.spring5.microbook.domain.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.sql.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.springframework.web.reactive.function.server.ServerResponse.status;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
//@Api(tags = {SwaggerConstant.API_TAG3})
public class MicroBookingController {

    protected static final Logger logger = Logger.getLogger(MicroBookingController.class.getName());

    @Autowired
    protected MovieService movieService;

    //http://localhost:8080/v1/movies"
    @GetMapping("/movie/{city_name}")
    public Flux<Movie> browseMovie(@PathVariable() String city_name) {
        //TODO: should return theaters, movies, and seat details.
            return movieService.findAll();
    }


    @GetMapping("/theater/{theater_id}/movie/{movie_id}")
    public Flux<Movie> browseTheater(@PathVariable() String theater_id
                                        , @PathVariable() String movie_id
                                        , @RequestParam() String city
                                        , @RequestParam() Date date) {
        //TODO: implement
        return movieService.findAll();
    }

    //TODO: change Mono<Movie> to Mono<Ticket>
    @PostMapping("/movie/{movie_id}/seat/{seats}")
    public Mono<Movie> bookMovie(@RequestParam() String movie_id
                                 , @RequestParam() String seats
                                 , @RequestParam() Date date) {

        Integer id = Integer.valueOf(movie_id);

        if (Objects.nonNull(id)) {
            return movieService.findById(id).map(ce -> status(HttpStatus.CREATED).body());
        }
        else {
            return Mono.error(() -> new Throwable("seats not available for movie " + movie_id));
        }
        return movieService.findById(id).switchIfEmpty(Mono.error(new Exception("No user found")));
    }

    //this is just arbitrary endpoint
    @GetMapping("/movieByDate/{id}")
    public Mono<Movie> onDate(@PathVariable Integer id) {
        logger.log(Level.INFO,"inserting data");
        movieService.insertDemoData();
        return movieService.findById(id).switchIfEmpty(Mono.error(new Exception("No User Found")));
    }

    @PostMapping("/admin/movie/{movie_id}")
    public Mono<String> adminMovieC(@PathVariable String movie_id) {

        return Mono.empty();
    }

    @PutMapping("/admin/movie/{movie_id}")
    public Mono<String> adminMovieU(@PathVariable String movie_id) {

        return Mono.empty();
    }

    @DeleteMapping("/admin/movie/{movie_id}")
    public Mono<String> adminMovieD(@PathVariable String movie_id) {

        return Mono.empty();
    }

    @GetMapping("/admin/movie")
    public Flux<String> adminMovieR() {

        return Flux.empty();
    }

    @PutMapping("/admin/movie/{movie_id}/seat/{seats}")
    public Mono<String> adminSeatAdjustment(@PathVariable String seat
                                            , @RequestParam Integer movie_id) {

        return Mono.empty();
    }
}
