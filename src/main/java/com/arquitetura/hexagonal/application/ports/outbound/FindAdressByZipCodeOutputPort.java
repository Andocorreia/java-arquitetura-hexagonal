package com.arquitetura.hexagonal.application.ports.outbound;

import com.arquitetura.hexagonal.application.core.domain.Adress;

public interface FindAdressByZipCodeOutputPort {

    Adress find(String zipCode);
}
