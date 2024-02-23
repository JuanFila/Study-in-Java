package br.com.example.firstprojectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //Anotation
@ComponentScan(basePackages = "br.com.example")
//ComponentScan é utilizado para o main visualizar outros arquivos que não estejam na  mesma camada
public class FirstProjectSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectSpringbootApplication.class, args);
	}

}
