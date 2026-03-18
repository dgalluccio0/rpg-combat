package io.github.dgalluccio0.rpgcombat.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterDTO {
	private UserDTO user;
	private List<ActionDTO> actions;
	private Integer might, speed, mind;
	private Integer leftLeg, rightLeg, leftArm, rightArm, torso, head;
}
