package in.ashokit.beans;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.dto.Customer;

public class App {

	public static void main(String[] args) throws Exception {

		App a = new App();

		a.convertJavaToJson();

		// a.convertJsonToJava();

	}

	public void convertJavaToJson() throws Exception {

		Customer c1 = new Customer();
		c1.setId(101);
		c1.setName("Ashok");
		c1.setPhno(7979799l);

		ObjectMapper mapper = new ObjectMapper();

		// Serialization
		mapper.writeValue(System.out, c1);

		File f = new File("customer.json");
		mapper.writeValue(f, c1);

		System.out.println("JSON created...");

	}

	public void convertJsonToJava() throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		// De-Serialization
		Customer customer = mapper.readValue(new File("customer.json"), Customer.class);
		System.out.println(customer);
	}
}
