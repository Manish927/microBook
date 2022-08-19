package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.time.Duration;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Movie {

    @Id
    Integer id;
    String name;
    //String date_of_release;
    //Duration duration;
}
