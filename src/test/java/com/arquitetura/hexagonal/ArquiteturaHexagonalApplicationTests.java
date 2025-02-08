package com.arquitetura.hexagonal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootTest(classes = {TestConfiguration.class})
class ArquiteturaHexagonalApplicationTests {

	@Test
	void contextLoads() {
	}

}
