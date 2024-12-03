package com.arquitetura.hexagonal.adapters.outbound.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customer")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private String email;

    private AddressEntity adress;

    private String cpf;

    private Boolean isValidCpf;
}
