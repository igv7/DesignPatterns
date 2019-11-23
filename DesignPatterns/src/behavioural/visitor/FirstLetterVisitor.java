package behavioural.visitor;

//Visitor Design Pattern
//when there are infinite options algorithms that can run on the same object
public class FirstLetterVisitor implements Visitor {

	private String firstLetters="";
	
	public void visit(VisitableString vs) {
		firstLetters+=vs.getValue().charAt(0)+" ";
	}
	
	public String getFirstLetters(){
		return firstLetters;
	}

}