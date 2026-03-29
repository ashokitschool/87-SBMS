package in.ashokit;

public class Car {

	private IEngine eng;

	public Car() {
		System.out.println("Car :: o-param constructor");
	}

	// Constructor Injection
	public Car(IEngine eng) {
		System.out.println("Car :: 1-param constructor");
		this.eng = eng;
	}

	// setter injection
	public void setEng(IEngine eng) {
		System.out.println("setEng() method called..");
		this.eng = eng; 
	}

	public void drive() {

		boolean status = eng.start();

		if (status) {
			System.out.println("Journey started..");
		} else {
			System.out.println("Engine Trouble...");
		}
	}
}
