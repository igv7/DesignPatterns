package structural.adapter_1;

public class Test {

	public static void main(String[] args) {

		System.out.println("United State Shipping...");
		NewShinyBox box1 = new NewShinyBox(new SamsungNote10(),new CableTypeC(),new ChargerUS());
		box1.whatsInsideTheBox();
		
		System.out.println("Eurpean Union Shipping...");
		NewShinyBox box2 = new NewShinyBox(new SamsungNote10(),new CableTypeC(),new ChargerEU());
		box2.whatsInsideTheBox();
		
		
	}

}