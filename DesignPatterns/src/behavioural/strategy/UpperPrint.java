package behavioural.strategy;

public class UpperPrint implements PrintStrategy {

	@Override
	public void print(String text) {
		System.out.println(text.toUpperCase());

	}

}