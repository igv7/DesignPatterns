package creational.abstractFactory2;

public class HTMLFactory extends FormatFactory{

	@Override
	public Validator getValidator() {
		return new HTMLValidator();
	}

	@Override
	public Printer getPrinter() {
		return new HTMLPrinter();
	}

	@Override
	public Editor getEditor() {
		return new HTMLEditor();
	}

}
