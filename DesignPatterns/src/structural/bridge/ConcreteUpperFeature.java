package structural.bridge;

public class ConcreteUpperFeature extends PrinterFeature {

	@Override
	public void print(String text) {
		System.out.println(text.toUpperCase());

	}

}