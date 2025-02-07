package com.arquitetura.hexagonal.application.core.domain;

public class Customer {
    private String id;
    private String name;
    private String email;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String id, String name, String email, Address address, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getCpf() {
        return cpf;
    }

    public Boolean getIsValidCpf() {
        return isValidCpf;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIsValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
