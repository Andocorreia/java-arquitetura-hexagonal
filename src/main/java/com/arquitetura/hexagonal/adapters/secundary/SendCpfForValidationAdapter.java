package com.arquitetura.hexagonal.adapters.secundary;

import com.arquitetura.hexagonal.application.ports.output.SendCpfForValidationOutputPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;



@Component
public class SendCpfForValidationAdapter implements SendCpfForValidationOutputPort {

    private static final String TOPIC = "topic_0";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final Logger logger = LoggerFactory.getLogger(SendCpfForValidationAdapter.class);

    public void send(String key, String value) {
        logger.info(String.format("#### -> Producing message -> %s", value));
        kafkaTemplate.send(TOPIC, key, value);
    }
}
