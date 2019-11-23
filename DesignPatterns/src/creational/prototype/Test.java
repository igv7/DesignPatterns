package creational.prototype;

public class Test {

	public static void main(String[] args) {
		Box b1 = new Box(5, 5, 5);
		System.out.println(b1);

		Box b2 = b1;

		b1.setC(15);

		System.out.println("************");
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);

		Box b3 = b1.makeACopy();

		System.out.println("************");
		System.out.println("b1 = " + b1);
		System.out.println("b3 = " + b3);

		b1.setC(78);
		System.out.println("b1 = " + b1);
		System.out.println("b3 = " + b3);

	}

}