package com.arquitetura.hexagonal;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;


@EnableFeignClients
@SpringBootTest(classes = {TestConfiguration.class})
public class ArquiteturaHexagonalApplicationTests {

	@Test
	void contextLoads() {
	}
}
