package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.input.ReceiveCpfForValidationInputPort;
import com.arquitetura.hexagonal.application.ports.output.FindCustomerOutputPort;
import com.arquitetura.hexagonal.application.ports.output.UpdateCustomerOutputPort;

public class ReceiveCpfForValidationUseCase implements ReceiveCpfForValidationInputPort {

    private FindCustomerOutputPort findCustomerOutputPort;
    private UpdateCustomerOutputPort updateCustomerOutputPort;

    public ReceiveCpfForValidationUseCase(FindCustomerOutputPort findCustomerOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerOutputPort = findCustomerOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void receiveCpfForValidation(String cpf) {
        Customer customer = this.findCustomerOutputPort.findByDocument(cpf).stream().findFirst().orElseThrow();
        customer.setIsValidCpf(true);
        this.updateCustomerOutputPort.update(customer);
    }
}
