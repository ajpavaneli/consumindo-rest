package br.com.ativa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages="br.com.ativa.client")
public class ConsumindoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoRestApplication.class, args);
	}

}
