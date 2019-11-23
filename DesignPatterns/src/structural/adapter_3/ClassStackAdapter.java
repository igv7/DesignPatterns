package structural.adapter_3;

//Stack example
//Another Adapter Example
public class ClassStackAdapter extends StackAdapter implements Stack {
	public void add(char ch){
		super.addElement(ch);
	}

	public void printStack() {
		super.print();
	}
}