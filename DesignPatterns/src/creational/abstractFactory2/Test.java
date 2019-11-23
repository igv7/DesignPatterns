package creational.abstractFactory2;

public class Test {
	
	
	public static void main(String[] args) {
		
		FormatFactory factory = (FormatFactory)new XMLFactory();
		
		factory.getEditor().edit();
		factory.getPrinter().print();
		factory.getValidator().validate();
	}
	
	
	
	
}