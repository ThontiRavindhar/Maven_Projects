package com.example.transactionmanagemt.service;

import com.example.transactionmanagemt.entity.Customer;
import com.example.transactionmanagemt.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        Objects.requireNonNull(customerRepository);
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
