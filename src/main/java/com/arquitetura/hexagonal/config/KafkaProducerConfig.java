package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.secundary.SendCpfForValidationAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configuration
public class KafkaProducerConfig {

    @Autowired
    SendCpfForValidationAdapter sendCpfForValidationAdapter;

    @Bean
    public CommandLineRunner CommandLineRunnerBean() {
        return (args) -> {};
    }

    @Autowired
    void SpringBootWithKafkaApplication(SendCpfForValidationAdapter sendCpfForValidationAdapter) {
        this.sendCpfForValidationAdapter = sendCpfForValidationAdapter;
    }

}
