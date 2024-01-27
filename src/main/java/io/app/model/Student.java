package io.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
	@Id
	@SequenceGenerator(
			name = "id_generator",
			sequenceName = "id_generator",
			allocationSize = 1,
			initialValue = 111101
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "id_generator"
	)
	private Long id;
	private String name;
	private String address;
}





