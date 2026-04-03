package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {

	@Id
	@GeneratedValue
	private Integer personId;
	private String name;
	private LocalDate dob;
	private String gender;

	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;
}






