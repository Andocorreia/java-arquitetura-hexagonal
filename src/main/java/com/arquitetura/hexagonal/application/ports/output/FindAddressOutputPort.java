package com.arquitetura.hexagonal.application.ports.output;

import com.arquitetura.hexagonal.application.core.domain.Address;

public interface FindAddressOutputPort {

    Address find(String zipCode);
}
