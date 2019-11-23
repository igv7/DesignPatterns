package creational.singleton_8;

//Nice Eagerly And Thread Safe Singleton
public class MySingleton {
	//the variable will be created when the class is loaded 
    private static final MySingleton instance = new MySingleton();
    private MySingleton(){
    	System.out.println("CTOR in action!");
    }
    public static MySingleton getInstance(){
        return instance;
    }
}