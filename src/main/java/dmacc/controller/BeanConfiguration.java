package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Contract;

// Austin Rathje

@Configuration
public class BeanConfiguration {

	@Bean
	public Contract contract() {
		Contract contract = new Contract();
		return contract;
	}
	
}
