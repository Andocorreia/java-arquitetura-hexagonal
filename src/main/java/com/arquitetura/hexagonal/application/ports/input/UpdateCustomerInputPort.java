package com.arquitetura.hexagonal.application.ports.input;


import com.arquitetura.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}