package entity;

public class Events {
	
	private int eventID;
	
	private String event_name;

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	@Override
	public String toString() {
		return "Events [eventID=" + eventID + ", event_name=" + event_name + "]";
	}
	
}
