package br.com.cmarchi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsLearningCadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLearningCadApplication.class, args);
	}


}
