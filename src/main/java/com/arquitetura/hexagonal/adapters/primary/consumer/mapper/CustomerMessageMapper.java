package com.arquitetura.hexagonal.adapters.primary.consumer.mapper;

import com.arquitetura.hexagonal.adapters.primary.consumer.message.CustomerMessage;

import com.arquitetura.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
