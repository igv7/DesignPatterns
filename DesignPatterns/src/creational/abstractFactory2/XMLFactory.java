package creational.abstractFactory2;

public class XMLFactory extends FormatFactory {

	@Override
	public Validator getValidator() {
		return new XMLValidator();
	}

	@Override
	public Printer getPrinter() {
		return new XMLPrinter();
	}

	@Override
	public Editor getEditor() {
		return new XMLEditor();
	}

}