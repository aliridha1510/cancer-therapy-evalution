package com.cancer.therapy.evolution.api;

import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.cancer.therapy.evolution.core.ConcerTherapyCoreConfiguration;

@SpringBootApplication
@Import({ ConcerTherapyCoreConfiguration.class })
@EnableAutoConfiguration
public class ConcerTherapyApiApplication {

	public static void main(String[] args) {
		run(ConcerTherapyApiApplication.class, args);
	}
}
