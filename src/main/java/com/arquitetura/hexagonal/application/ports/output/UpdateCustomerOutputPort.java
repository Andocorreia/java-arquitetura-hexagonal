package com.arquitetura.hexagonal.application.ports.output;

import com.arquitetura.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}