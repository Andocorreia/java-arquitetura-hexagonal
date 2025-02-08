package com.arquitetura.hexagonal.adapters.secundary.repository;

import com.arquitetura.hexagonal.adapters.secundary.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

    Optional<CustomerEntity> findByCpf(String cpf);
}
