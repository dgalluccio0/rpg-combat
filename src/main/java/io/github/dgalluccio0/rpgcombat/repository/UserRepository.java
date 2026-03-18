package io.github.dgalluccio0.rpgcombat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.dgalluccio0.rpgcombat.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
