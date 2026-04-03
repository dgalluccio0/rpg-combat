package io.github.dgalluccio0.usermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"io.github.dgalluccio0.usermanager.service","io.github.dgalluccio0.usermanager.controller", "io.github.dgalluccio0.usermanager.exceptions", "io.github.dgalluccio0.usermanager.config"})
@EnableJpaRepositories(basePackages = {"io.github.dgalluccio0.usermanager.repository"})
@EntityScan(basePackages = {"io.github.dgalluccio0.usermanager.model"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
