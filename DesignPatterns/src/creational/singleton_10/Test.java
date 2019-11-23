package creational.singleton_10;

public class Test {

	public static void main(String[] args) {

		MySingleton instance1 = MySingleton.INSTANCE;
		instance1.sayMyName();
		
		MySingleton instance2 = MySingleton.INSTANCE;
		instance2.sayMyName();
		
		instance1.name="Heisenberg";
		
		instance1.sayMyName();
		instance2.sayMyName();
	}

}