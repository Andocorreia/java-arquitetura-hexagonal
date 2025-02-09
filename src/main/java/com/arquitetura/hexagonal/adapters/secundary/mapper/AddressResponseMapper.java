package com.arquitetura.hexagonal.adapters.secundary.mapper;

import com.arquitetura.hexagonal.adapters.secundary.repository.response.ClientAddressResponse;
import com.arquitetura.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(ClientAddressResponse clientAddressResponse);
}
