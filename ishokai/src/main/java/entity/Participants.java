package entity;

public class Participants {
	
	private int participantID;
	
	private String participant_name;
	
	private int admission_year;
	
	private int participation_type; //現役初 = 1,現役一般 = 2, OB =3
	
	private String email;
	
	private String free_message;
	
	public int getParticipantID() {
		return participantID;
	}
	public void setParticipantID(int participantID) {
		this.participantID = participantID;
	}
	public String getparticipant_name() {
		return participant_name;
	}
	public void setparticipant_name(String participant_name) {
		this.participant_name = participant_name;
	}
	public int getAdmission_year() {
		return admission_year;
	}
	public void setAdmission_year(int admission_year) {
		this.admission_year = admission_year;
	}
	public int getParticipation_type() {
		return participation_type;
	}
	public void setParticipation_type(int participation_type) {
		this.participation_type = participation_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFree_message() {
		return free_message;
	}
	public void setFree_message(String free_message) {
		this.free_message = free_message;
	}
	@Override
	public String toString() {
		return "Participants [participantID=" + participantID + ", participant_name=" + participant_name + ", admission_year=" + admission_year
				+ ", participation_type=" + participation_type + ", email=" + email + ", free_message=" + free_message
				+ "]";
	}
}
