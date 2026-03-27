package io.github.dgalluccio0.rpgcombat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"io.github.dgalluccio0.rpgcombat.service","io.github.dgalluccio0.rpgcombat.controller", "io.github.dgalluccio0.rpgcombat.exceptions", "io.github.dgalluccio0.rpgcombat.security"})
@EnableJpaRepositories(basePackages = {"io.github.dgalluccio0.rpgcombat.repository"})
@EntityScan(basePackages = {"io.github.dgalluccio0.rpgcombat.model"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
