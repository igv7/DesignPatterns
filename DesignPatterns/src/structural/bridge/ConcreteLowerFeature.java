package structural.bridge;

public class ConcreteLowerFeature extends PrinterFeature{

	@Override
	public void print(String text) {
		System.out.println(text.toLowerCase());
		
	}

}