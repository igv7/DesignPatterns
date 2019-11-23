package structural.bridge;

public class Test {

	public static void main(String[] args) {

		RegularRefinedAbstraction r = new RegularRefinedAbstraction();
		r.printInAllFormats("Regular");
		
		MidRefinedAbstraction m  = new MidRefinedAbstraction();
		m.printInAllFormats("Mid");
	
		DeluxeRefinedAbstraction d = new DeluxeRefinedAbstraction();
		d.printInAllFormats("Delux");

	}

}