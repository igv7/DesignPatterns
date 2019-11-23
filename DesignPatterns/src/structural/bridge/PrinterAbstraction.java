package structural.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class PrinterAbstraction {
protected List<PrinterFeature> features=new ArrayList<PrinterFeature>();
	
	public PrinterAbstraction(){
		loadPrinters();
	}
	
	public void printInAllFormats(String text){
		for(PrinterFeature feature:features)
			feature.print(text);
	}
	
	protected abstract void loadPrinters();
}