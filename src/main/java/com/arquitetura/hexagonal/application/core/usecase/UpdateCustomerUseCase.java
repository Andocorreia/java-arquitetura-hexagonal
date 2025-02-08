package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.input.UpdateCustomerInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindAddressOutputPort;
import com.arquitetura.hexagonal.application.ports.output.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {
    
    private final FindAddressOutputPort findAddressOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindAddressOutputPort findAddressOutputPort,
                                 UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findAddressOutputPort = findAddressOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {

        customer.setAddress(this.findAddressOutputPort.find(zipCode));

        updateCustomerOutputPort.update(customer);

    }
}