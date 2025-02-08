package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.secundary.FindAddressAdapter;

import com.arquitetura.hexagonal.adapters.secundary.UpdateCustomerAdapter;
import com.arquitetura.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.arquitetura.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindAddressAdapter findAddressByZipCodeOutputPort,
            UpdateCustomerAdapter updateCustomerOutputPort
    ) {
       return new UpdateCustomerUseCase(findAddressByZipCodeOutputPort, updateCustomerOutputPort);
    }
}
