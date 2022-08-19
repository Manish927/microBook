package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.util.Pair;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
public class Screen {

    @Id
    Integer id;
    String name;
    Date start_date;
    Date end_date;
    Movie movie;
    List<Pair<Time, Time>> showTimings;
    Map<SeatType, List<Seat>> Tiers;
}
