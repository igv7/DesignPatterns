package creational.singleton_2;

public class Test {

	public static void main(String[] args) {
		System.out.println("START");

		System.out.println("Some code bofore...");

		MySingleton.getInstance();

		System.out.println("Some code after...");

		System.out.println("END");
	}

}