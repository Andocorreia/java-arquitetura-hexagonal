package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.input.UpdateCustomerInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindAddressOutputPort;
import com.arquitetura.hexagonal.application.ports.output.SendCpfForValidationOutputPort;
import com.arquitetura.hexagonal.application.ports.output.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private static final String CPF = "CPF";
    private final FindAddressOutputPort findAddressOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public UpdateCustomerUseCase(FindAddressOutputPort findAddressOutputPort,
                                 UpdateCustomerOutputPort updateCustomerOutputPort,
                                 SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressOutputPort = findAddressOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {

        customer.setAddress(this.findAddressOutputPort.find(zipCode));

        updateCustomerOutputPort.update(customer);

        this.sendCpfForValidationOutputPort.send(this.CPF, customer.getCpf());

    }
}