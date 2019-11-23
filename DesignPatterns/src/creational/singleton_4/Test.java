package creational.singleton_4;

public class Test {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> MySingleton.getInstance());

		Thread t2 = new Thread(() -> MySingleton.getInstance());

		t1.start();
		t2.start();

	}

}