package com.arquitetura.hexagonal.adapters.primary.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String zipCode;

    @NotBlank
    private String cpf;

    public String getZipCode() {
        return this.zipCode;
    }
}
