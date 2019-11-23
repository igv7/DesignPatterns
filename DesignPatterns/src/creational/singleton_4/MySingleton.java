package creational.singleton_4;

//Thread Safe But Not Efficient Singleton
public class MySingleton {
	
	private static MySingleton instance = null;
	
	private MySingleton() {
		System.out.println("CTOR in action!");
	}

	public static synchronized MySingleton getInstance() {//Now Thread Safe, But Not efficient
		if(instance==null) {
			instance = new MySingleton();//Not Thread Safe
		}
		return instance;
	}
	
	
}