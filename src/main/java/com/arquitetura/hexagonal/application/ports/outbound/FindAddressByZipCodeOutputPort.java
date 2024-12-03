package com.arquitetura.hexagonal.application.ports.outbound;

import com.arquitetura.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
