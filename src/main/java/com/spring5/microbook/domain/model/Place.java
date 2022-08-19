package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Place {

    @Id
    Integer id;
    String name;

    String country;
    String state;
    int zipCode;
    List<Theater> theaters;

}
