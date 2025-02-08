package com.arquitetura.hexagonal.adapters.secundary.repository.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientAddressResponse {
    private String street;
    private String number;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
