package structural.adapter_2;

public class NewShinyBox {
	private SamsungNote10 device;
	private CableTypeC cable;
	private Chrager charger;

	
	public NewShinyBox(SamsungNote10 device, CableTypeC cable, Chrager charger) {
		this.device = device;
		this.cable = cable;
		this.charger = charger;
	}



	public NewShinyBox() {
	}
	
	
	
	public SamsungNote10 getDevice() {
		return device;
	}



	public void setDevice(SamsungNote10 device) {
		this.device = device;
	}



	public CableTypeC getCable() {
		return cable;
	}



	public void setCable(CableTypeC cable) {
		this.cable = cable;
	}



	public Chrager getCharger() {
		return charger;
	}



	public void setCharger(Chrager charger) {
		this.charger = charger;
	}



	public void whatsInsideTheBox() {
		device.print();
		cable.print();
		charger.print();
	}
	
	
}