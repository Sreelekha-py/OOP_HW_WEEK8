
public class SubscriberThrees implements SubscriberInterface{
	int thrres_count = 0;

	@Override
	public void notifyMe(MyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean notifyObserver(MyEvent event_random) {
		// TODO Auto-generated method stub
		int eventdata = event_random.getDataValue();
		if(eventdata%3 == 0)
		{
			thrres_count = thrres_count + 1;
			if(thrres_count <= 10) 
			{
			System.out.printf("SubscriberThrees:  %d Event is Threes - %d \n",  eventdata,event_random.getDataValue());
			
			System.out.println(thrres_count);
			return true;
			}
			if(thrres_count > 10)
			{
				if(thrres_count % 40 == 0)
				{
				thrres_count = 0;
				}
				return false;
			}
		}
		return false;

	}
	

}
