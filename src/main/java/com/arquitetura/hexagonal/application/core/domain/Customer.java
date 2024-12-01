package com.arquitetura.hexagonal.application.core.domain;

public class Customer {
    private String id;
    private String name;
    private String email;
    private Adress adress;
    private String cpf;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }
    public Customer(String id, String name, String email, Adress adress, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adress = adress;
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

    public Adress getAdress() {
        return adress;
    }

    public String getCpf() {
        return cpf;
    }

    public Boolean getValidCpf() {
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

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
