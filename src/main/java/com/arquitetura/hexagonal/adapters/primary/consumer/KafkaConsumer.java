package com.arquitetura.hexagonal.adapters.primary.consumer;

import com.arquitetura.hexagonal.application.ports.input.ReceiveCpfForValidationInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Autowired
    ReceiveCpfForValidationInputPort receiveCpfForValidationInputPort;

    @KafkaListener(topics=  "topic_0", groupId= "spring-ccloud")
    public void consume(String cpf) {
        receiveCpfForValidationInputPort.receiveCpfForValidation(cpf);
    }
}
