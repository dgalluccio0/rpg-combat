package io.github.dgalluccio0.rpgcombat.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import io.github.dgalluccio0.rpgcombat.model.Role;
import io.github.dgalluccio0.rpgcombat.model.User;
import io.github.dgalluccio0.rpgcombat.repository.RoleRepository;
import io.github.dgalluccio0.rpgcombat.repository.UserRepository;
import io.github.dgalluccio0.rpgcombat.utils.RoleType;

@Configuration
public class TableInitializer {
    @Bean
    public CommandLineRunner createAdminUser(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            Role adminRole = roleRepository.findByName(RoleType.ADMIN).orElseGet(() -> {
                Role newRole = new Role();
                newRole.setName(RoleType.ADMIN);
                return roleRepository.save(newRole);
            });

            if (userRepository.findByUsername("admin").isEmpty()){
                User admin = new User();
                admin.setUsername("admin");
                admin.setEmail("admin@galluccio.com");
                admin.setPassword(passwordEncoder.encode("admin"));
                admin.getRoles().add(adminRole);
                userRepository.save(admin);
            }
        };
    }
}
