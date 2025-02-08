package com.arquitetura.hexagonal.adapters.primary.controller.mapper;

import com.arquitetura.hexagonal.adapters.primary.controller.request.CustomerRequest;
import com.arquitetura.hexagonal.adapters.primary.controller.response.CustomerResponse;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "cpf", source = "cpf")
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

    Collection<CustomerResponse> toCustomerResponseList( Collection<Customer> customer);
}
