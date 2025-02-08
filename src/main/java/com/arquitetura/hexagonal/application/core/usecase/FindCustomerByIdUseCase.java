package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindCustomerOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerOutputPort findCustomerOutputPort;

    public FindCustomerByIdUseCase(FindCustomerOutputPort findCustomerOutputPort) {
        this.findCustomerOutputPort = findCustomerOutputPort;
    }

    @Override
    public Customer find(String id) {
        return this.findCustomerOutputPort.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
