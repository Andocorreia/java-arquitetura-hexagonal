package com.arquitetura.hexagonal.adapters.secundary.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {

    private String street;
    private String number;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
