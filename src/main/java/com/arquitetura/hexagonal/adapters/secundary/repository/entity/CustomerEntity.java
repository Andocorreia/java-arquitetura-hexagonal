package com.arquitetura.hexagonal.adapters.secundary.repository.entity;

import com.azure.core.annotation.Get;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private String email;

    private AddressEntity address;

    private String cpf;

    private Boolean isValidCpf;
}
