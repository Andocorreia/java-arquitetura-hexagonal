package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.secundary.FindCustomerAdapter;
import com.arquitetura.hexagonal.adapters.secundary.UpdateCustomerAdapter;
import com.arquitetura.hexagonal.application.core.usecase.ReceiveCpfForValidationUseCase;
import com.arquitetura.hexagonal.application.ports.input.ReceiveCpfForValidationInputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReceiveCpfForValidationConfig {

    @Bean
    public ReceiveCpfForValidationUseCase receiveCpfForValidationInputPort(
            FindCustomerAdapter findCustomerAdapter, UpdateCustomerAdapter updateCustomerAdapter) {
        return new ReceiveCpfForValidationUseCase(findCustomerAdapter, updateCustomerAdapter);
    }
}
