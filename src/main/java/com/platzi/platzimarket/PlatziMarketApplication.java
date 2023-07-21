package com.platzi.platzimarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(scanBasePackages={"com.platzi.platzimarket.persistence.mapper.ProductMapper"})// if it is necessary because the code did not find the mapper so I had to show it.
public class PlatziMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
