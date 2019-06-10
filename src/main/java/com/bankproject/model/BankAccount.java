package com.bankproject.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankAccount {

    private int accountId;

    private String type;

    private Double amountOfMoney;

    private Double limit;

    private double percent;

    private Double debt;

    private LocalDate expirationDate;
}
