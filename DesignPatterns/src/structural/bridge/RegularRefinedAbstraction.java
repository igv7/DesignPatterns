package structural.bridge;

public class RegularRefinedAbstraction extends PrinterAbstraction{

	@Override
	protected void loadPrinters() {
		features.add(new ConcreteLowerFeature());
		features.add(new ConcreteUpperFeature());
		//features.add(new ConcreteTabbedFeature());
	}

}