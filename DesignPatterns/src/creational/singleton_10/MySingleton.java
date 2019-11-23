package creational.singleton_10;

//Enum Singleton
public enum MySingleton {
	INSTANCE;
	
	String name="Walter White";
	
	public void sayMyName() {
		System.out.println(name);
	}
	
	
}
