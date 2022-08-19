package com.spring5.microbook;

import com.spring5.microbook.domain.service.MovieService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
@EnableR2dbcRepositories
public class MicroBookApplication {

    MovieService movieService;
    /*public static void main(String[] args) {
        SpringApplication.run(MicroBookApplication.class, args);
    }*/


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MicroBookApplication.class);
        app.setWebApplicationType(WebApplicationType.REACTIVE);
        app.run();
    }
    /*@Bean
    public RouterFunction<ServerResponse> routes(MovieService ms) {
        return route()
                .GET("/greet/{name}", request -> ok().body(ms.toString()))
                .build();
    }*/
}
