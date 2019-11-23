package creational.builder;

public class Test {

	public static void main(String[] args) {

	//Builders
	GoldAccountBuilder g = new GoldAccountBuilder();
	PlatinumAccountBuilder p = new PlatinumAccountBuilder();
	RegularAccountBuilder r = new RegularAccountBuilder();
	
	//Setup
	createAndPrintAccount(r);
	
	}
	
	public static void createAndPrintAccount(AccountBuilder builder){
		AccountDirector director=new AccountDirector();
		director.setAccountBuilder(builder);
		director.constructAccount();
		Account account = director.getAccount();
		System.out.println(account);
	}

}