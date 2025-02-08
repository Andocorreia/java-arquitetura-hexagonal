package com.arquitetura.hexagonal.config;


import com.arquitetura.hexagonal.adapters.secundary.FindCustomerAdapter;
import com.arquitetura.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerAdapter findCustomerAdapter
    ) {
       return new FindCustomerByIdUseCase(findCustomerAdapter);
    }
}
