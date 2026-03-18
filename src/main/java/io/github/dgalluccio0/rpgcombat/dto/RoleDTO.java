package io.github.dgalluccio0.rpgcombat.dto;

import io.github.dgalluccio0.rpgcombat.utils.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {
	private Long id;
	private RoleType role;
	private UserDTO user;
}
