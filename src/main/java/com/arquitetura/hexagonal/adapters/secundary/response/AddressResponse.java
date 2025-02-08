package com.arquitetura.hexagonal.adapters.secundary.response;

import lombok.Data;

@Data
public class AddressResponse {
    private String street;
    private String number;
    private String city;
    private String state;
    private String country;
    private String zipCode;

}
