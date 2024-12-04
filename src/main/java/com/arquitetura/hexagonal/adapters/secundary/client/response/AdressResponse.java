package com.arquitetura.hexagonal.adapters.secundary.client.response;

import lombok.Data;

@Data
public class AdressResponse {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

}
