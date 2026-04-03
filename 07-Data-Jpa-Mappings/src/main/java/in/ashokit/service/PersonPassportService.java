package in.ashokit.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonPassportService {

	@Autowired
	private PersonRepo personRepo;

	public void savePersonWithPassport() {

		Passport passport = new Passport();
		passport.setPassportNum("K8HKHK6");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));

		Person person = new Person();
		person.setName("John");
		person.setDob(LocalDate.now().minusYears(20));
		person.setGender("Male");

		// association mapping
		passport.setPerson(person);
		person.setPassport(passport);

		// saving data
		personRepo.save(person);
	}

	public void getPerson(int personId) {
		personRepo.findById(personId);
	}
}
