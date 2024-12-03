package com.arquitetura.hexagonal.adapters.outbound.repository;

import com.arquitetura.hexagonal.adapters.outbound.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
