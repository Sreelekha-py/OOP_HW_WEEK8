
public class SubscriberOdds implements SubscriberInterface{
	int odd_count = 0;
	@Override
	public void notifyMe(MyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean notifyObserver(MyEvent event_random) {
		int eventdata = event_random.getDataValue();
		if(eventdata%2 == 1)
		{
			odd_count = odd_count + 1;
			if(odd_count <= 21) 
			{
			System.out.printf("SubscriberOdds:  %d Event is odd - %d \n",  eventdata,event_random.getDataValue());
			System.out.println(odd_count);
			return true;
			}
			if(odd_count > 21)
			{
				if(odd_count % 40 == 0)
				{
				odd_count = 0;
				}
				return false;
			}
		}
		return false;
	}

}
