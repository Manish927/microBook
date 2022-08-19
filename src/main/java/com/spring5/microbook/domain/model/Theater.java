package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Theater {

    @Id
    Integer id;
    String name;
    List<Screen> screens;
}
