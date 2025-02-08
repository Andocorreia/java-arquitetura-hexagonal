package com.arquitetura.hexagonal.adapters.secundary.mapper;

import com.arquitetura.hexagonal.adapters.secundary.repository.entity.CustomerEntity;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

    Collection<Customer> toCustomerList(Collection<CustomerEntity> customerEntity);
}
