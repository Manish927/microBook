package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Table
public class Ticket {

    @Id
    Integer id;
    String name;
    List<Seat> seats;
}
