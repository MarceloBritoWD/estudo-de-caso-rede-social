package br.com.redesocial.multimediaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MultimediaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultimediaServiceApplication.class, args);
	}

}
