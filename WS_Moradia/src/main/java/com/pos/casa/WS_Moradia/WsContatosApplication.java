package com.pos.casa.WS_Moradia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WsContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsContatosApplication.class, args);
	}
}
