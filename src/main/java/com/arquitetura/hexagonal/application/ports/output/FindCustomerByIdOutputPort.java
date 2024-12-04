package com.arquitetura.hexagonal.application.ports.output;

import com.arquitetura.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
