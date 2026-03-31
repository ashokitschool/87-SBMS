package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmployeeService;
import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserService userService = context.getBean(UserService.class);

		// userService.saveUser();
		// userService.saveUsers();
		// userService.getUserById(101);
		// userService.getAllUsers();
		// userService.getUsersWithPagination();
		// userService.getUsersWithQBE();
		// userService.getUsersByCountry("India");
		// userService.invokeCustomQueries();
		// userService.deleteUserWithCustomQuery(105);

		EmployeeService empService = context.getBean(EmployeeService.class);
		// empService.saveEmployee();
		// empService.updateEmp();
		empService.getEmps();
	}

}
