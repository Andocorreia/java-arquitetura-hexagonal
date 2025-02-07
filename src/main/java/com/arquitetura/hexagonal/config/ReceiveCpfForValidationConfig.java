package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.application.core.usecase.ReceiveCpfForValidationUseCase;
import com.arquitetura.hexagonal.application.ports.input.ReceiveCpfForValidationInputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReceiveCpfForValidationConfig {
    @Bean
    public ReceiveCpfForValidationInputPort receiveCpfForValidationInputPort() {
        return new ReceiveCpfForValidationUseCase();
    }
}
