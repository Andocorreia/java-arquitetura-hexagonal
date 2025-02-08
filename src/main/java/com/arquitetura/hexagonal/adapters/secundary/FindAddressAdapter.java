package com.arquitetura.hexagonal.adapters.secundary;

import com.arquitetura.hexagonal.adapters.secundary.repository.FindAddressByZipCodeClientRepository;
import com.arquitetura.hexagonal.adapters.secundary.repository.response.ClientAddressResponse;
import com.arquitetura.hexagonal.adapters.secundary.mapper.AddressResponseMapper;
import com.arquitetura.hexagonal.application.core.domain.Address;
import com.arquitetura.hexagonal.application.ports.output.FindAddressOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressAdapter implements FindAddressOutputPort {

    @Autowired
    private FindAddressByZipCodeClientRepository findAddressByZipCodeClientRepository;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        ClientAddressResponse clientAddressResponse = findAddressByZipCodeClientRepository.find(zipCode);
       return this.addressResponseMapper.toAddress(clientAddressResponse);
    }
}
