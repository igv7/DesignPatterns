package creational.singleton_1;

//Eagerly Singleton
public class MySingleton {

	private static final MySingleton instance = new MySingleton();

	private MySingleton() {
		System.out.println("CTOR in action!");
	}

	public static MySingleton getInstance() {
		return instance;
	}

}