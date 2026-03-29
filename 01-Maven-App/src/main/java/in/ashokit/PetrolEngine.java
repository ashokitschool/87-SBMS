package in.ashokit;

public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("Petrol Engine Obj Created...");
	}
	
	public boolean start() {
		// logic to start
		
		System.out.println("Petrol Engine Started..");
		
		return true;
	}

}
