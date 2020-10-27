import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SubscriberEvensTest {
	PublisherImpl pub =new PublisherImpl();
	SubscriberEvens even = new SubscriberEvens();

	@Test
	public void test() {
		pub.addSubscriber(even);
		for(int i=1;i<201;i++)
		{
			MyEvent event_random = pub.generateevent(i);
			if(pub.subscribers.contains(even))
			{	
			 even.notifyObserver(event_random);	
			}
			if(even.even_count > 14) {
				assertEquals(even.notifyObserver(event_random),false);
			}
			if(even.even_count%40 == 0) {
				assertEquals(even.even_count,0);
			}
		}
		
	}
}
