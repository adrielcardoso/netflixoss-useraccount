package br.com.adrielcardoso.useracount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UseracountApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseracountApplication.class, args);
	}
}
