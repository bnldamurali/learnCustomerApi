package com.learn.learnCustomerApi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private long custId;
    private String firstName;
    private String lastName;
}
