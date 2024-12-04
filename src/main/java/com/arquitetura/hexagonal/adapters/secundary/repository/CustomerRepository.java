package com.arquitetura.hexagonal.adapters.secundary.repository;

import com.arquitetura.hexagonal.adapters.secundary.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
