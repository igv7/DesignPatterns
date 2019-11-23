package structural.decorator;

public class Test {
	public static void main(String[] args) {
		
		Coffee coffee = new Coffee();
		System.out.println(coffee.getCost());
		System.out.println(coffee.getDescription());
		
		CheeseCake cake = new CheeseCake();
		System.out.println(cake.getCost());
		System.out.println(cake.getDescription());
		
		CreamDecorator creamDecorator1 = new CreamDecorator(coffee);
		System.out.println(creamDecorator1.getCost());
		System.out.println(creamDecorator1.getDescription());
		
		CreamDecorator creamDecorator2 = new CreamDecorator(cake);
		System.out.println(creamDecorator2.getCost());
		System.out.println(creamDecorator2.getDescription());
		
		OreoDecorator oreoDecorator1 = new OreoDecorator(creamDecorator2);
		System.out.println(oreoDecorator1.getCost());
		System.out.println(oreoDecorator1.getDescription());
	}
}