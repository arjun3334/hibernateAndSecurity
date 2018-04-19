package com.exxx.newSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NewSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSecurityApplication.class, args);
	}
}
