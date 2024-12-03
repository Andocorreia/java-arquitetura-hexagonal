package com.arquitetura.hexagonal.adapters.outbound.client;

import com.arquitetura.hexagonal.adapters.outbound.client.response.AdressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "findAdressByZipCodeClient",
        url = "${arantes.client.adress.url}"
)
public interface FindAdressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AdressResponse find(@PathVariable("zipCode") String zipCode);
}
