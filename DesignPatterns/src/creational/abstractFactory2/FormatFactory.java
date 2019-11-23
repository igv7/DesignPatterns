package creational.abstractFactory2;

public abstract class FormatFactory {
	
	public abstract Validator getValidator();
	public abstract Printer getPrinter();
	public abstract Editor getEditor();
}