package entity;

public class Attendance {
	private int attendanceID;
	
	private int participantID;
	
	private int event_costID;
	
	private int quantity;

	public int getAttendanceID() {
		return attendanceID;
	}

	public void setAttendanceID(int attendanceID) {
		this.attendanceID = attendanceID;
	}

	public int getParticipantID() {
		return participantID;
	}

	public void setParticipantID(int participantID) {
		this.participantID = participantID;
	}

	public int getEvent_costID() {
		return event_costID;
	}

	public void setEvent_costID(int event_costID) {
		this.event_costID = event_costID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Attendance [attendanceID=" + attendanceID + ", participantID=" + participantID + ", event_costID="
				+ event_costID + ", quantity=" + quantity + "]";
	}
	

}
