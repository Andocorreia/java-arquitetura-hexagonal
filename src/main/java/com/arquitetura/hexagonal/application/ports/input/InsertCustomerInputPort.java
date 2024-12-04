package com.arquitetura.hexagonal.application.ports.input;

import com.arquitetura.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
