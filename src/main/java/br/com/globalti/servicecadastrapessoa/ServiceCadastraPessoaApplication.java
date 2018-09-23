package br.com.globalti.servicecadastrapessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceCadastraPessoaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceCadastraPessoaApplication.class, args);
	}
}
