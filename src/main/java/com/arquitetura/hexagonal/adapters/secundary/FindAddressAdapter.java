package com.arquitetura.hexagonal.adapters.secundary;

import com.arquitetura.hexagonal.adapters.secundary.client.FindAddressByZipCodeClient;
import com.arquitetura.hexagonal.adapters.secundary.client.mapper.AddressResponseMapper;
import com.arquitetura.hexagonal.adapters.secundary.client.response.AddressResponse;
import com.arquitetura.hexagonal.application.core.domain.Address;
import com.arquitetura.hexagonal.application.ports.output.FindAddressOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressAdapter implements FindAddressOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
       return this.addressResponseMapper.toAddress(addressResponse);
    }
}
