package structural.decorator;

public class CreamDecorator extends Item{
	private Item myItem;

	public CreamDecorator(Item myItem) {
		this.myItem = myItem;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return myItem.getCost() + 1.99;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return myItem.getDescription() +" + cream";
	}

}