package com.learn.learnCustomerApi.controller;

import com.learn.learnCustomerApi.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @GetMapping("/customer/{customerId}")
    public Customer getCustomer(@PathVariable String customerId)
    {
        System.out.println("getCustomer..............:"+customerId);
        return new Customer(121L, "test First Name", "test Last Name");
    }
}
