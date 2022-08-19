package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Seat {

    @Id
    Integer id;
    String name;
    Double price;
    Date bookedOn;
    boolean booked;


}
