package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.secundary.FindAddressAdapter;
import com.arquitetura.hexagonal.adapters.secundary.InsertCustomerAdapter;
import com.arquitetura.hexagonal.adapters.secundary.SendCpfForValidationAdapter;
import com.arquitetura.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressAdapter findAddressAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
       return new InsertCustomerUseCase(findAddressAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }
}
