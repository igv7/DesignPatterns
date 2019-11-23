package behavioural.strategy;

//To avoid code breaking to ensure stability, the left side of the statement must be used with the highest relevant abstraction
//Strategy Design Pattern
public class LowerPrint implements PrintStrategy {

	public void print(String text) {
		System.out.println(text.toLowerCase());
	}

}