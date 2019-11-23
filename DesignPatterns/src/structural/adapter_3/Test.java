package structural.adapter_3;

public class Test {
	public static void main(String[] args) {
		StackAdapter s1 = new StackAdapter();
		s1.addElement('K');
		s1.addElement('o');
		s1.addElement('b');
		s1.addElement('i');
		
		s1.print();
		
		Stack s2 = new ObjectStackAdapter();
		s2.add('K');
		s2.add('o');
		s2.add('b');
		s2.add('i');
		
		s2.printStack();
		
		Stack s3 = new ClassStackAdapter();
		s3.add('K');
		s3.add('o');
		s3.add('b');
		s3.add('i');
		s3.printStack();
	}
	
	
	
}