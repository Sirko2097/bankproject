package com.bankproject.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private int userId;

    private String login;

    private String password;

    private String role;

    private String firstName;

    private String lastName;

    private String email;

}
