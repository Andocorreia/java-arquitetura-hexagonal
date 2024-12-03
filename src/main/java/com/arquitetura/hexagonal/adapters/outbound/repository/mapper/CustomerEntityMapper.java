package com.arquitetura.hexagonal.adapters.outbound.repository.mapper;

import com.arquitetura.hexagonal.adapters.outbound.repository.entity.CustomerEntity;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
