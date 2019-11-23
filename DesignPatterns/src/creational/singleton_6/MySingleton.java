package creational.singleton_6;

//Thread Safe With Double Lock Solve Singleton
public class MySingleton {
	
	private static MySingleton instance = null;
	
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