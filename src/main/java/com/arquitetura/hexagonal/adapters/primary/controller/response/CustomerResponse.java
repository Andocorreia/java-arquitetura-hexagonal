package com.arquitetura.hexagonal.adapters.primary.controller.response;


import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private String email;

    private AddressResponse adress;

    private String cpf;

    private Boolean isValidCpf;
}
