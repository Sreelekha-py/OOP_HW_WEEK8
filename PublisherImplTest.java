import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PublisherImplTest {
	PublisherImpl pub = new PublisherImpl();
	SubscriberInterface s = null;
	MyEvent e = null;


	@Test
	public void testForAdding() {
		assertEquals(pub.addSubscriber(s),"Subscriber Added");
	}
	
	@Test
	public void testForRemoving() {
		assertEquals(pub.removeSubscriber(s),"Subscriber Removed");
	}
	
	@Test
	public void testForNotifyAll(){
		assertEquals(pub.notifyAll(e),"All Subscriber Notified");	
	}

}
