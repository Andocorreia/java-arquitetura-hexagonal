package com.arquitetura.hexagonal.config;


import com.arquitetura.hexagonal.adapters.secundary.FindCustomerByIdAdapter;
import com.arquitetura.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
       return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
