package structural.bridge;

public class ConcreteReverseFeature extends PrinterFeature {

	@Override
	public void print(String text) {
		char ch[]=text.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
	}

}