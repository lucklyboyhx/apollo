package com.hx.hxapollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.hx.hxapollo"})
public class HxApolloApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(HxApolloApplication.class, args);
	}
}
