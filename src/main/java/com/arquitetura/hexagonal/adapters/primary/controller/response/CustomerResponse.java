package com.arquitetura.hexagonal.adapters.primary.controller.response;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

    private String id;
    private String name;
    private String email;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
