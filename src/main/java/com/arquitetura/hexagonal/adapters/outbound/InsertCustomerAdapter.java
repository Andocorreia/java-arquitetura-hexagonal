package com.arquitetura.hexagonal.adapters.outbound;

import com.arquitetura.hexagonal.adapters.outbound.repository.CustomerRepository;
import com.arquitetura.hexagonal.adapters.outbound.repository.mapper.CustomerEntityMapper;
import com.arquitetura.hexagonal.application.core.domain.Customer;
import com.arquitetura.hexagonal.application.ports.outbound.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntitu = this.customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntitu);
    }
}
