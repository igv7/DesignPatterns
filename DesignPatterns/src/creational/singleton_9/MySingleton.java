package creational.singleton_9;

//Ultimate Efficient Singleton
//Correct lazy initialisation in Java 
public class MySingleton {
	
	private MySingleton() {
		System.out.println("CTOR in action!");
	}
 
	private static class SingletonHolder {
    public static MySingleton instance = new MySingleton();
 }

 public static MySingleton getInstance() {
     return SingletonHolder.instance;
 }
}