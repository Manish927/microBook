package com.spring5.microbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@Table
public class User {

    @Id
    UUID id;

    @NotNull(message = "User name is required")
    private String name;
    private String address;
    private String familyName;
    private String password;
    private List<Ticket> ticketList;

}
