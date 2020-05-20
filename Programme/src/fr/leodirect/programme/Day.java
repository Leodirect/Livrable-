package fr.leodirect.programme;

public enum Day {
	MATIN(8, "matin"), 
	MIDI(12, "manger"), 
	APRESMIDI(15, "geeker"), 
	SOIR(22, "soire"), 
	NUIT(2, "dodo");
	
	private int hour;
	private String message;
	
	Day(int hour, String message){
		this.hour = hour;
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public int getHour() {
		return hour;
	}
}
