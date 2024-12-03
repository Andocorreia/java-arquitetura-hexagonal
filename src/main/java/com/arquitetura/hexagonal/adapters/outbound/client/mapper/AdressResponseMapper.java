package com.arquitetura.hexagonal.adapters.outbound.client.mapper;

import com.arquitetura.hexagonal.adapters.outbound.client.response.AdressResponse;
import com.arquitetura.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdressResponseMapper {

    Address toAddress(AdressResponse adressResponse);
}
