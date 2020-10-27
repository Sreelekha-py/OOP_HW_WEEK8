public class MyEvent {
	
		
	public int EventSequenceNum;
	public int EventDataValue;
	
	public MyEvent(int EventSequenceNum, int EventDataValue)
	{
		this.EventDataValue= EventDataValue;
		this.EventSequenceNum = EventSequenceNum;		
	}

	public int getDataValue() {
		return EventDataValue;
	}
	public int getEventSeqNum() {
		return EventSequenceNum;
	}
}
