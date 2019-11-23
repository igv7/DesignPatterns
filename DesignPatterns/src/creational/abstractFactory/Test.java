package creational.abstractFactory;

public class Test {

	public static void main(String[] args) {

		FormatFactory facory = new Java106Factory();
		facory.getAdmin().admin();
		facory.getTeacher().teach();
		
		
		
		FormatFactory facory2 = new Java113Factory();
		facory2.getAdmin().admin();
		facory2.getTeacher().teach();
	}

}