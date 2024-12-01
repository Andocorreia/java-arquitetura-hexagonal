package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.outbound.FindAdressByZipCodeOutputPort;
import com.arquitetura.hexagonal.application.ports.outbound.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPor) {
        this.findAdressByZipCodeOutputPort = findAdressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPor;
    }

    public void insert(Customer customer, String zipCode) {
        var adress = findAdressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(adress);
        insertCustomerOutputPort.insert(customer);

    }
}
