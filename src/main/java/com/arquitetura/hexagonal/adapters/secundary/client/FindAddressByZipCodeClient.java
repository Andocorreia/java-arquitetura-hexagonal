package com.arquitetura.hexagonal.adapters.secundary.client;

import com.arquitetura.hexagonal.adapters.secundary.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "findAddressByZipCodeClient",
        url = "${client.address.url}")
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
