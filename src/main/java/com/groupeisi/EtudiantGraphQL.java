package com.groupeisi;

import com.groupeisi.dao.EtudiantRepository;
import com.groupeisi.entity.Etudiant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EtudiantGraphQL {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantGraphQL.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository){
		return args -> {
			etudiantRepository.save(Etudiant.builder().nom("Ndiaye").prenom("Mody").email("mody@gmail.com").build());
			etudiantRepository.save(Etudiant.builder().nom("Ba").prenom("Bouba").email("ba@gmail.com").build());
		};
	}

}
