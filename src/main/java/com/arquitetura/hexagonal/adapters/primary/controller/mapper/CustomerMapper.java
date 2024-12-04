package com.arquitetura.hexagonal.adapters.primary.controller.mapper;

import com.arquitetura.hexagonal.adapters.primary.controller.request.CustomerRequest;
import com.arquitetura.hexagonal.adapters.primary.controller.response.CustomerResponse;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
