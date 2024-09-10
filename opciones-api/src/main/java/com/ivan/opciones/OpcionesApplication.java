package com.ivan.opciones;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ivan.opciones.entity.Opcion;
import com.ivan.opciones.repository.OpcionRepository;

@SpringBootApplication
public class OpcionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpcionesApplication.class, args);
	}


	// @Bean
	// CommandLineRunner runner(OpcionRepository opcionRepository){
	// 	return (String... args) -> {
	// 			List<Opcion> lista = new ArrayList<Opcion>();
	// 			lista.add(new Opcion(1, "EL", 0.9, 0.35, 80.0, "P", "V"));
	// 			lista.add(new Opcion(1,"TNA", 0.6, 0.35, 44.5, "P", "V"));
	// 			lista.add(new Opcion(2,"TQQQ", 0.6, 0.35, 25.0, "P", "C"));
	// 			opcionRepository.saveAll(lista);
	// 	};
	// }

}
