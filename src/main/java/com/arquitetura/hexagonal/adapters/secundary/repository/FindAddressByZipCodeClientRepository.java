package com.arquitetura.hexagonal.adapters.secundary.repository;

import com.arquitetura.hexagonal.adapters.secundary.repository.response.ClientAddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClientRepository",
        url = "${client.address.url}")
public interface FindAddressByZipCodeClientRepository {

    @GetMapping("/{zipCode}")
    ClientAddressResponse find(@PathVariable("zipCode") String zipCode);
}
