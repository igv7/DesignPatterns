package structural.bridge;

public class DeluxeRefinedAbstraction extends PrinterAbstraction {

	@Override
	protected void loadPrinters() {
		features.add(new ConcreteLowerFeature());
		features.add(new ConcreteUpperFeature());	
		features.add(new ConcreteReverseFeature());	
		features.add(new ConcreteTabbedFeature());	
	}

}