
public class SubscriberEvens implements SubscriberInterface{
	int even_count = 0;

	@Override
	public void notifyMe(MyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean notifyObserver(MyEvent event_random) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		int eventdata = event_random.getDataValue();
		if(eventdata%2 == 0)
		{
			even_count = even_count + 1;
			if(even_count <= 14) 
			{
			System.out.printf("SubscriberEvens:  %d Event is Even - %d \n",  eventdata, event_random.getDataValue());
			System.out.println(even_count);
			return true;
			}
			if(even_count > 14)
			{
				if(even_count % 40 == 0)
				{
				even_count = 0;
				}
				return false;
			}
		}
		return false;

		
	}

}
