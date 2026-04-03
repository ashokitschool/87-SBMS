package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmpService;
import in.ashokit.service.PersonPassportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		PersonPassportService personService = context.getBean(PersonPassportService.class);

		// personService.savePersonWithPassport();
		personService.getPerson(1);

		EmpService empService = context.getBean(EmpService.class);
		// empService.saveEmpWithAddresses();
		empService.getEmpById(1);
	}

}
