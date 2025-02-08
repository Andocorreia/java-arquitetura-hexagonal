package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.ports.input.DeleteCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.output.DeleteCustomerOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final DeleteCustomerOutputPort deleteCustomerOutputPort;

    public DeleteCustomerByIdUseCase(DeleteCustomerOutputPort deleteCustomerOutputPort) {
        this.deleteCustomerOutputPort = deleteCustomerOutputPort;
    }

    @Override
    public void delete(String id) {
        this.deleteCustomerOutputPort.delete(id);
    }
}
