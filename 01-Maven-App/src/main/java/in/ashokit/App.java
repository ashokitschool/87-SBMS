package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// starting IOC Container

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");

		Car car = ctxt.getBean(Car.class);

		car.drive();
	}

}