package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.ports.input.ReceiveCpfForValidationInputPort;

public class ReceiveCpfForValidationUseCase implements ReceiveCpfForValidationInputPort {


    @Override
    public void receiveCpfForValidation(String cpf) {
        System.out.println("ReceiveCpfForValidationUseCase - received= " + cpf);
    }
}
