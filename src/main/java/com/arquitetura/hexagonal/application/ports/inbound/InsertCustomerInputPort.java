package com.arquitetura.hexagonal.application.ports.inbound;

import com.arquitetura.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
