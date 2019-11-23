package behavioural.observer;

public class Test {
	public static void main(String[] args) {
		
		Subject johnBryceChannel = new Channel();
		Subscriber s1 = new Subscriber("Matan");
		Subscriber s2 = new Subscriber("Keren");
		Subscriber s3 = new Subscriber("Igor");
		Subscriber s4 = new Subscriber("Elior");
		Subscriber s5 = new Subscriber("Kobi");
		
		johnBryceChannel.subscribe(s1);
		johnBryceChannel.subscribe(s2);
		johnBryceChannel.subscribe(s3);
		johnBryceChannel.subscribe(s4);
		johnBryceChannel.subscribe(s5);
		
		s1.subscribeChannle(johnBryceChannel);
		s2.subscribeChannle(johnBryceChannel);
		s3.subscribeChannle(johnBryceChannel);
		s4.subscribeChannle(johnBryceChannel);
		s5.subscribeChannle(johnBryceChannel);
		
		
		
		
		johnBryceChannel.upload("Intro to Programming");
		
		System.out.println("*****************************************");
		johnBryceChannel.unSubscribe(s3);
		
		johnBryceChannel.upload("Basic Java");
		
		
	}
}