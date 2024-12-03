package com.arquitetura.hexagonal.adapters.outbound;

import com.arquitetura.hexagonal.adapters.outbound.client.FindAdressByZipCodeClient;
import com.arquitetura.hexagonal.adapters.outbound.client.mapper.AdressResponseMapper;
import com.arquitetura.hexagonal.application.core.domain.Address;
import com.arquitetura.hexagonal.application.ports.outbound.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

        @Autowired
        private FindAdressByZipCodeClient findAdressByZipCodeClient;

        @Autowired
        private AdressResponseMapper adressResponseMapper;

        @Override
        public Address find(String zipCode) {
           var adressResponse = findAdressByZipCodeClient.find(zipCode);
           return this.adressResponseMapper.toAddress(adressResponse);
        }
}
