package com.arquitetura.hexagonal.adapters.secundary.mapper;

import com.arquitetura.hexagonal.adapters.secundary.repository.response.ClientAddressResponse;
import com.arquitetura.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    @Mapping(target = "street", source = "street")
    @Mapping(target = "number", source = "number")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "state", source = "state")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "zipCode", source = "zipCode")
    Address toAddress(ClientAddressResponse clientAddressResponse);
}
