package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Estudiante estudiante1 = new Estudiante("Pepe", "Gancho", "pepe1@gmail.com");
		 * repositorio.save(estudiante1);
		 * 
		 * Estudiante estudiante2 = new Estudiante("Juan", "Magán", "juan2@gmail.com");
		 * repositorio.save(estudiante2);
		 * 
		 * Estudiante estudiante3 = new Estudiante("Rita", "Rojas", "rita3@gmail.com");
		 * repositorio.save(estudiante3);
		 */
	}

}
