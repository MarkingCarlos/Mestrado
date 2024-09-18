package com.markingcarlos.springmestrado;

import com.markingcarlos.springmestrado.Entity.FisicaEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMestradoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMestradoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FisicaEntity pessoafisica = InstaceGenerator.getPessoaFisica("111.222.333-44","user1");
		System.out.println("\n" + pessoafisica + "\n");
	}

}
