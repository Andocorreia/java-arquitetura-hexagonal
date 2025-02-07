package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.secundary.FindAddressByZipCodeAdapter;
import com.arquitetura.hexagonal.adapters.secundary.InsertCustomerAdapter;
import com.arquitetura.hexagonal.adapters.secundary.SendCpfForValidationAdapter;
import com.arquitetura.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
       return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }
}
