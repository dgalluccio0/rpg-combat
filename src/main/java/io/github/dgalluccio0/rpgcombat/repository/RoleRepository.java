package io.github.dgalluccio0.rpgcombat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.dgalluccio0.rpgcombat.model.Role;
import io.github.dgalluccio0.rpgcombat.utils.RoleType;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(RoleType name);
}
