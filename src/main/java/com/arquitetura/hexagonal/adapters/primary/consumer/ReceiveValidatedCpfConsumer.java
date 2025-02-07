package com.arquitetura.hexagonal.adapters.primary.consumer;

import com.arquitetura.hexagonal.adapters.primary.consumer.mapper.CustomerMessageMapper;
import com.arquitetura.hexagonal.application.ports.input.UpdateCustomerInputPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    CustomerMessageMapper customerMessageMapper;

    private final Logger logger = LoggerFactory.getLogger(ReceiveValidatedCpfConsumer.class);

    @KafkaListener(id = "myConsumer", topics = "topic_0", groupId = "springboot-group-1", autoStartup = "false")
    public void consume(
        String  value,
        @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
        @Header(KafkaHeaders.RECEIVED_KEY) String key) {
            logger.info(String.format("\n\n Consumed event from topic %s: key = %-10s value = %s \n\n", topic, key, value));
            //this.updateCustomerInputPort.update(customerMessageMapper.toCustomer(customerMessage),
            //        customerMessage.getZipCode());
        }
}
