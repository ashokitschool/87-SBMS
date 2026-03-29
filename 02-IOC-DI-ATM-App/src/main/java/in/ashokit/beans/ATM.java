package in.ashokit.beans;

public class ATM {

	private IPrinter printer;

	public ATM() {
		System.out.println("ATM :: 0- Constructor Executed");
	}

	// CI
	public ATM(IPrinter printer) {
		this.printer = printer;
		System.out.println("ATM :: Param Constructor Executed");
	}

	// SI
	public void setPrinter(IPrinter printer) {
		this.printer = printer;
		System.out.println("setPrinter() method executed..");
	}

	public void withdraw() {

		System.out.println("Withdraw successfull");

		printer.print();

	}
}
