

public interface PublisherInterface {
	
	public String addSubscriber(SubscriberInterface s);
	public String removeSubscriber(SubscriberInterface s);
	
	public String notifyAll(MyEvent e);

}
