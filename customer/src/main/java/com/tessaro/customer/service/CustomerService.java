package com.tessaro.customer.service;

import com.tessaro.customer.model.Customer;
import com.tessaro.customer.model.request.CustomerRegistrationRequest;
import com.tessaro.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.getFirstName())
                .lastName(customerRegistrationRequest.getLastName())
                .email(customerRegistrationRequest.getEmail())
                .build();

        customerRepository.save(customer);

        //todo: check if email valid
        //todo: check if email not taken

    }
}
