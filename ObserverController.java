public class ObserverController {

	public static void main(String[] args) {
		PublisherImpl p = new PublisherImpl();
		SubscriberInterface s = new SubscriberOdds();		
		p.addSubscriber(s);
		p.runSimulation();
	}

}
