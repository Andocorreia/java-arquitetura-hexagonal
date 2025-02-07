package com.arquitetura.hexagonal.adapters.primary.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CustomerMessage {

    private String id;
    private String name;
    private String email;
    private String zipCode;
    private String cpf;
    private Boolean isValidCpf;

}
