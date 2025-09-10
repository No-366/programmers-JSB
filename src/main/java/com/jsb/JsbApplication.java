package com.jsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
@ActiveProfiles("dev")
public class JsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsbApplication.class, args);
	}

}
