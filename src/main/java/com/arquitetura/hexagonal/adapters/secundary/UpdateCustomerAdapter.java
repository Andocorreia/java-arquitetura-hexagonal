package com.arquitetura.hexagonal.adapters.secundary;

import com.arquitetura.hexagonal.adapters.secundary.repository.CustomerRepository;
import com.arquitetura.hexagonal.adapters.secundary.repository.mapper.CustomerEntityMapper;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.output.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        this.customerRepository.save(customerEntity);
    }
}