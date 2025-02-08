package com.arquitetura.hexagonal.adapters.secundary.repository;

import com.arquitetura.hexagonal.adapters.secundary.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

    @Query(value = "{ 'cpf': ?0 }", sort = "{ '_id': 1 }")
    Optional<CustomerEntity> findByCpf(String cpf);
}
