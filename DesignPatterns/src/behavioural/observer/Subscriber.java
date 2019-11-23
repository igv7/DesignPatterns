package behavioural.observer;

public class Subscriber implements Observer {
	
	private String name;
	private Subject channel = new Channel();
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey "+name+" a new video Uploaded --> "+ channel.getTitle());
	}
	
	@Override
	public void subscribeChannle(Subject ch) {
		channel = ch;
	}

	

}