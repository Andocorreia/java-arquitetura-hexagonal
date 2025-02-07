package com.arquitetura.hexagonal.application.ports.output;

public interface SendCpfForValidationOutputPort {

    void send(String key, String value);
}
