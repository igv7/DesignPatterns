package creational.factoryMethod;

public class Android implements Mobile {

	@Override
	public void info() {
		System.out.println("This is an Android");
	}

	@Override
	public void call() {

		System.out.println("Using the dialer");

	}

	@Override
	public void data() {
		System.out.println("Conncted to the Web");

	}

}