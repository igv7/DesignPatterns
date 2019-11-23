package structural.adapter_2;

public class ChargerAdapter implements Chrager{

	ChargerAus charger = new ChargerAus();
	@Override
	public void print() {
		System.out.println("AUS - Model I");
		
	}

}