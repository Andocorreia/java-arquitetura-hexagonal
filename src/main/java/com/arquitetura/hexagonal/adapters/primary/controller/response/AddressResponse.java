package com.arquitetura.hexagonal.adapters.primary.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private String street;
    private String number;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
