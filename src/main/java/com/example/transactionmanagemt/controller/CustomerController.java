package com.example.transactionmanagemt.controller;

import com.example.transactionmanagemt.entity.Customer;
import com.example.transactionmanagemt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        Objects.requireNonNull(customerService);
        this.customerService = customerService;
    }

    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody Customer customer) {

    }

}
