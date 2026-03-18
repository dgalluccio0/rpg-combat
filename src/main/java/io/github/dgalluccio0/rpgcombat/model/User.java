package io.github.dgalluccio0.rpgcombat.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Email
	@Size(max = 100)
	private String email;
	
	@NotBlank
	@Size(max = 25)
	private String username;
	
	@NotBlank
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Role> roles;
	
	@OneToMany(mappedBy="character")
	private List<Character> characters;
}
