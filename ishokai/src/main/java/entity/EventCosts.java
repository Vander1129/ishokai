package entity;

public class EventCosts {
	private int event_costID;
	
	private int eventID;
	
	private int cost;

	public int getEvent_costID() {
		return event_costID;
	}

	public void setEvent_costID(int event_costID) {
		this.event_costID = event_costID;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "EventCosts [event_costID=" + event_costID + ", eventID=" + eventID + ", cost=" + cost + "]";
	}
	

}
