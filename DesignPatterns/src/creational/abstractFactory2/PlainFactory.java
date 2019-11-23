package creational.abstractFactory2;

public class PlainFactory extends FormatFactory {

	@Override
	public Validator getValidator() {
		return new PlainValidator();
	}

	@Override
	public Printer getPrinter() {
		return new PlainPrinter();
	}

	@Override
	public Editor getEditor() {
		return new PlainEditor();
	}

}
