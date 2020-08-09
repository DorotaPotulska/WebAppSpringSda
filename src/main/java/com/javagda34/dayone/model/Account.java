package com.javagda34.dayone.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {

    private String id;
    private Long saldo;
    private String name;
    private String surname;
}
