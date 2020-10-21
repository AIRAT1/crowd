package de.crowd;

import de.crowd.domain.Employee;
import de.crowd.repo.EmployeeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrowdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrowdApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(EmployeeRepo repository) {
		return (args) -> {
			repository.save(new Employee("Jack", "Bauer", ""));
			repository.save(new Employee("Chloe", "O'Brian", ""));
			repository.save(new Employee("Kim", "Bauer", ""));
			repository.save(new Employee("David", "Palmer", ""));
			repository.save(new Employee("Michelle", "Dessler", ""));
		};
	}

}
