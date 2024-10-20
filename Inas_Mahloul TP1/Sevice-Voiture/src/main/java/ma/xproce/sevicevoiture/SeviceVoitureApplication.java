package ma.xproce.sevicevoiture;

import ma.xproce.sevicevoiture.Services.ClientService;
import ma.xproce.sevicevoiture.dao.entities.Client;
import ma.xproce.sevicevoiture.dao.entities.Voiture;
import ma.xproce.sevicevoiture.dao.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeviceVoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeviceVoitureApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository, ClientService
			clientService) {
		return args -> {
			Client c1 = clientService.clientById(2L);
			Client c2 = clientService.clientById(1L);
			System.out.println("**************************");
			System.out.println("Id est: + c2.getId()");
			System.out.println("Nom est :+ c2.getNom()");
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("Id est : + c1.getId()");
			System.out.println("Nom est :+ c1.getNom()");
			System.out.println("Nom est : + c1.getAge()");
			System.out.println("**************************");
			voitureRepository.save(new Voiture(Long.parseLong("1"), "Toyota", "A 25 333",
					"Corolla", 1L, c2));

			voitureRepository.save(new Voiture(Long.parseLong("2"), "Renault", "B 6 3456"
					, "Megane", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("3"), "Peugeot", "A 55 4444"
					, "301", 2L, c1));

		};
	}

}
