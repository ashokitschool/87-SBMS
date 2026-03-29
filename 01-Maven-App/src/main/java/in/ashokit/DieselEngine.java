package in.ashokit;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine Obj Created...");
	}

	public boolean start() {
		// logic to start

		System.out.println("DieselEngine Engine Started..");

		return true;
	}

}
