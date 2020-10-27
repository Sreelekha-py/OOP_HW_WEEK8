
import java.util.ArrayList;

public class PublisherImpl implements PublisherInterface {
	ArrayList<SubscriberInterface> subscribers = new ArrayList<SubscriberInterface>();
	
	
	// add the subscriber to list
	@Override
	public String addSubscriber(SubscriberInterface s) {
		subscribers.add(s);
		return "Subscriber Added";
	}

	@Override
	public String removeSubscriber(SubscriberInterface s) {
		subscribers.remove(s);
		return "Subscriber Removed";
		
	}

	@Override
	public String notifyAll(MyEvent e) {
		for (SubscriberInterface s : subscribers) {
			s.notifyMe(e);
		}
		return "All Subscriber Notified";
	}
	
	public MyEvent generateevent(int i)
	{   
	    int data = (int)(Math.random() * 1000 + 1);	
		MyEvent e = new MyEvent(i, data);
		return e;
	}

	public void runSimulation() {
		PublisherImpl pub =new PublisherImpl();
		SubscriberOdds Odds= new SubscriberOdds();
		SubscriberEvens Evens = new SubscriberEvens();
		SubscriberThrees Threes = new SubscriberThrees();
		
		pub.addSubscriber(Odds);
		pub.addSubscriber(Evens);
		pub.addSubscriber(Threes);	
		
		for(int i=1;i<201;i++)
		{
			MyEvent event_random = pub.generateevent(i);
			if(pub.subscribers.contains(Odds))
			{	
			 Odds.notifyObserver(event_random);
			}
			
			if(pub.subscribers.contains(Threes))
			{	
			 Threes.notifyObserver(event_random);
			} 
			if(pub.subscribers.contains(Evens))
			{	
			 Evens.notifyObserver(event_random);
			} 
	
		// TODO Auto-generated method stub
		}
	}
}
