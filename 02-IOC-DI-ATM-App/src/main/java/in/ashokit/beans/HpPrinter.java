package in.ashokit.beans;

public class HpPrinter implements IPrinter {

	public HpPrinter() {
		System.out.println("Hp Printer :: Constructor Executed..");
	}

	@Override
	public boolean print() {

		System.out.println("Print completed (Hp Printer)");

		return true;
	}

}
