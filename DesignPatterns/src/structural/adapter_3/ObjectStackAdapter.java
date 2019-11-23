package structural.adapter_3;

public class ObjectStackAdapter implements Stack {

	StackAdapter stack=new StackAdapter();
	@Override
	public void add(char ch) {
		stack.addElement(ch);

	}

	@Override
	public void printStack() {
		stack.print();

	}

}