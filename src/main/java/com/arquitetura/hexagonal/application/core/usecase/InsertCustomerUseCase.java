package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Address;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.InsertCustomerInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import com.arquitetura.hexagonal.application.ports.output.InsertCustomerOutputPort;
import com.arquitetura.hexagonal.application.ports.output.SendCpfForValidationOutputPort;


public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final static String KEY = "CPF";
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPor,
                                 SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPor;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        Address address = this.findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        this.insertCustomerOutputPort.insert(customer);

        this.sendCpfForValidationOutputPort.send(this.KEY, customer.getCpf());

    }
}
