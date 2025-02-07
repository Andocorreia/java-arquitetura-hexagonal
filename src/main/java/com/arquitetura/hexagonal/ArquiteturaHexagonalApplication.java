package com.arquitetura.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ArquiteturaHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaHexagonalApplication.class, args);
	}

}
