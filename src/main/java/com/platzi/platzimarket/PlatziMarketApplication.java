package com.platzi.platzimarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = {"com.platzi.platzimarket.persistence", "com.platzi.platzimarket.persistence.mapper"})
// @MapperScan("com.platzi.platzimarket.persistence.mapper")
// @SpringBootApplication(scanBasePackages={"com.platzi.platzimarket.persistence.mapper.ProductMapper"})// if it is necessary because the code did not find the mapper so I had to show it.
// @ComponentScan(basePackages = {"com.platzi.platzimarket.web.controller"})
public class PlatziMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
