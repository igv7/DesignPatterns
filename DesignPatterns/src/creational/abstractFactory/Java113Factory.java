package creational.abstractFactory;

public class Java113Factory extends FormatFactory {

	@Override
	public Teacher getTeacher() {
		return new Java113Teacher();
	}

	@Override
	public Admin getAdmin() {
		return new Java113Admin();
	}

}