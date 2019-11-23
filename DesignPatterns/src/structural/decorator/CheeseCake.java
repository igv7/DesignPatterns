package structural.decorator;

//A chain of creation, Support more complex ability but not as in inheritance
public class CheeseCake extends Item {

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 21;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "House Cheese cake";
	}

}