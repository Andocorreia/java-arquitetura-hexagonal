package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.secundary.DeleteCustomerAdapter;
import com.arquitetura.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.arquitetura.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            DeleteCustomerAdapter deleteCustomerAdapter
    ) {
        return new DeleteCustomerByIdUseCase(deleteCustomerAdapter);
    }
}
