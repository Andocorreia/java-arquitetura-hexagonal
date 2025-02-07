package com.arquitetura.hexagonal.adapters.secundary;

import com.arquitetura.hexagonal.adapters.secundary.repository.CustomerRepository;
import com.arquitetura.hexagonal.application.ports.output.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        this.customerRepository.deleteById(id);
    }
}
