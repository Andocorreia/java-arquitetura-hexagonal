package com.arquitetura.hexagonal.adapters.secundary.repository.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class AddressEntity {

    private String street;
    private String number;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
