package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.input.UpdateCustomerInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import com.arquitetura.hexagonal.application.ports.output.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {
    
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {

        this.findCustomerByIdInputPort.find(customer.getId());

        customer.setAddress(this.findAddressByZipCodeOutputPort.find(zipCode));

        updateCustomerOutputPort.update(customer);

    }
}