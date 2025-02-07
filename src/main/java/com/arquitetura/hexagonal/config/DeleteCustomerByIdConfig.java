package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.secundary.DeleteCustomerByIdAdapter;
import com.arquitetura.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.arquitetura.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
