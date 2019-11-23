package creational.prototype;

//Duplicate an Object by himself
public class Box implements Cloneable {
	private int a;
	private int b;
	private int c;
	
	
	public Box(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Box [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public Box makeACopy() {
		Box b=null;
		try {
			b = (Box) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
	
}