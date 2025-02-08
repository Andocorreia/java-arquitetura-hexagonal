package com.arquitetura.hexagonal.application.ports.output;

import com.arquitetura.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerOutputPort {

    Optional<Customer> findById(String id);

    Optional<Customer> findByDocument(String document);
}
