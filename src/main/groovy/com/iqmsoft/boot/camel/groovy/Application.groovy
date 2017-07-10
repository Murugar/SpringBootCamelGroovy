package com.iqmsoft.boot.camel.groovy

import org.springframework.boot.SpringApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class Application {

	static void main(String[] args) {
		SpringApplication.run Application, args
	}
}
