package behavioural.visitor;

public class LetterCounterVisitor implements Visitor {
	
	private int count = 0;

	@Override
	public void visit(VisitableString vs) {
		count += vs.getValue().length();

	}

	public int getLettersCount() {
		return count;
	}

}