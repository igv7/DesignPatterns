package structural.bridge;

public class ConcreteTabbedFeature extends PrinterFeature {

	@Override
	public void print(String text) {
		char ch[]=text.toCharArray();
		for(char c:ch){
			System.out.print(c+"\t");
		}
		System.out.println();
	}
}