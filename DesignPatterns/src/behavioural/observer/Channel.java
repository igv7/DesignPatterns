package behavioural.observer;

//Observer Design Pattern
//Event Driven Development 
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private String title;
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	@Override
	public void unSubscribe(Observer subscriber)
	{
		subscribers.remove(subscriber);
	}
	
	@Override
	public void notifySubscribers() {
		for(Observer subscriber: subscribers) {
			subscriber.update();
		}
	}
	
	
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	
}