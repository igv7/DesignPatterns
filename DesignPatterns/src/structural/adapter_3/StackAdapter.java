package structural.adapter_3;

import java.util.ArrayList;

public class StackAdapter {
private ArrayList<Character> chars=new ArrayList<Character>();
	
	public void addElement(char ch) {
		chars.add(Character.toLowerCase(ch));
	}
	
	public void print(){
		System.out.println(chars);
	}
}