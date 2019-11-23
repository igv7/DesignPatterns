package creational.singleton_5;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> MySingleton.getInstance());

		Thread t2 = new Thread(() -> MySingleton.getInstance());

		t1.start();
		t2.start();
	}

}