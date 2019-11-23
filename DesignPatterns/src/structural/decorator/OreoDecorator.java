package structural.decorator;

public class OreoDecorator extends Item{
	private Item myItem;

	public OreoDecorator(Item myItem) {
		this.myItem = myItem;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return myItem.getCost() + 2.5;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return myItem.getDescription() +" + Oreo Topping!";
	}
}