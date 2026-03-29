package in.ashokit.beans;

public class SonyPrinter implements IPrinter{
	
	public SonyPrinter() {
		System.out.println("Sony Printer :: Constructor");
	}
	
	@Override
	public boolean print() {

		System.out.println("Print Completed.. (Sony Printer)");
		
		return false;
	}

}
