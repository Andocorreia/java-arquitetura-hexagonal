package com.arquitetura.hexagonal.adapters.secundary.repository;

import com.arquitetura.hexagonal.adapters.secundary.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
