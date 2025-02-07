package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.ports.input.DeleteCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.output.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                     DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        this.findCustomerByIdInputPort.find(id);
        this.deleteCustomerByIdOutputPort.delete(id);
    }
}
