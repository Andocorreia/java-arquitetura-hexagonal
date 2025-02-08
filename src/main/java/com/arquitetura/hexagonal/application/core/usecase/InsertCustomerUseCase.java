package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Address;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.InsertCustomerInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindAddressOutputPort;
import com.arquitetura.hexagonal.application.ports.output.InsertCustomerOutputPort;
import com.arquitetura.hexagonal.application.ports.output.SendCpfForValidationOutputPort;


public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final static String KEY = "CPF";
    private final FindAddressOutputPort findAddressOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressOutputPort findAddressOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPor,
                                 SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressOutputPort = findAddressOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPor;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        Address address = this.findAddressOutputPort.find(zipCode);
        customer.setAddress(address);
        this.insertCustomerOutputPort.insert(customer);

        this.sendCpfForValidationOutputPort.send(this.KEY, customer.getCpf());

    }
}
