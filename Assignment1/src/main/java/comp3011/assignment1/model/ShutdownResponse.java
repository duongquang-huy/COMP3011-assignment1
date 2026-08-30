package comp3011.assignment1.model;

public class ShutdownResponse {
	private String message; // Message from server
	
	public ShutdownResponse(String message) {
		this.message = message;
		
	}
	public String getMessage() {return message;}
}
