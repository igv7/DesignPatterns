package creational.factoryMethod;

public class Iphone implements Mobile {

	public void info() {
		System.out.println("This is an iPhone");
	}
	
	public void call() {
		System.out.println("Using the dialer");
	}
	
	public void data() {
		System.out.println("Conncted to the Web");
	}

	
}