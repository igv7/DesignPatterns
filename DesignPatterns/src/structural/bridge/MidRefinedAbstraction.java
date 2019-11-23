package structural.bridge;

public class MidRefinedAbstraction extends PrinterAbstraction {


	@Override
	protected void loadPrinters() {
		features.add(new ConcreteReverseFeature());
		features.add(new ConcreteTabbedFeature());	
	}

}