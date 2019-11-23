package creational.factoryMethod;

public class Test {

	public static void main(String[] args) {

//		Mobile mobile = new Android();
//		
//		mobile.info();
//		mobile.call();
//		mobile.data();
		
		Mobile mobile = createNewObject("droid");
		mobile.info();
		mobile.call();
		mobile.data();
	}
	
	public static Mobile createNewObject(String os) {
		if(os.equals("ios")) {
			return new Iphone();
		}else if(os.equals("droid")) {
			return new Android();
		}else {
			return null;
		}
	}

}