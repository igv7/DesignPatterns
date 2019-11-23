package creational.singleton_5;

//More Efficient But Not Thread Safe (= Double Lock Problem) Singleton
public class MySingleton {
	
	private static MySingleton instance = null;
	
	private MySingleton() {
		System.out.println("CTOR in action!");
	}

	public static MySingleton getInstance() {//Better performance, But Again, Not Thread Safe
		if(instance == null) {
		      synchronized(MySingleton.class) { 
		    	  instance = new MySingleton();
		      }
		   }
		return instance;
	}
	
	
}