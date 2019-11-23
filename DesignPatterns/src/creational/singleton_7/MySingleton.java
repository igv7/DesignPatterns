package creational.singleton_7;

//Volatile Singleton
public class MySingleton {
private volatile static MySingleton instance = null;
	
	private MySingleton() {
		System.out.println("CTOR in action!");
	}

	public static MySingleton getInstance() {//Better performance, But Again, Not Thread Safe
		if(instance == null) {
		     synchronized(MySingleton.class) {
		       if(instance == null) {
		    	   instance = new MySingleton();
		       }
		    }
		  }
		return instance;
	}
}