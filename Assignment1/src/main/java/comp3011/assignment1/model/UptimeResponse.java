package comp3011.assignment1.model;

public class UptimeResponse {
	private String utcServerStart; // UTC time server started
	private String utcNow; 	// Current time
	private double serverUptimeSeconds; // server started and current time gap
	
	public UptimeResponse(String utcServerStart,String utcNow, double serverUptimeSeconds) {
		this.utcServerStart = utcServerStart;
		this.utcNow = utcNow;
		this.serverUptimeSeconds = serverUptimeSeconds;
	}
	public String getutcServerStart() {return utcServerStart;}
	public String getutcNow() {return utcNow;}
	public double getserverUptimeSeconds() {return serverUptimeSeconds;}
}
