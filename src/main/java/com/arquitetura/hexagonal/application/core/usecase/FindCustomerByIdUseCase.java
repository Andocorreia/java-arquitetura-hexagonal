package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindCustomerOutputPort;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerOutputPort findCustomerOutputPort;

    public FindCustomerByIdUseCase(FindCustomerOutputPort findCustomerOutputPort) {
        this.findCustomerOutputPort = findCustomerOutputPort;
    }

    @Override
    public Customer find(String id) {
        return this.findCustomerOutputPort.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @Override
    public Collection<Customer> findAll() {
        Optional<Collection<Customer>> customers =  this.findCustomerOutputPort.findAll();
        return customers.orElseGet(Collections::emptyList);
    }
}
