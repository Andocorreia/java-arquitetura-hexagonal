package com.arquitetura.hexagonal.application.ports.input;

import com.arquitetura.hexagonal.application.core.domain.Customer;

import java.util.Collection;
import java.util.Optional;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

    Collection<Customer> findAll();
}
