package comp3011.assignment1.controller;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comp3011.assignment1.model.UptimeResponse;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	// server start time
	private static final Instant SERVER_START = Instant.now();
	
	// get server start and current time, and uptime
	// By GET //localhost:8080/api/v1/admin/uptime
	@GetMapping("/uptime")
	public ResponseEntity<UptimeResponse> getUpTime(){
		Instant now = Instant.now();
		double uptimeSeconds = ChronoUnit.SECONDS.between(SERVER_START, now);
		UptimeResponse response = new UptimeResponse(SERVER_START.toString(), now.toString(), uptimeSeconds);
		return ResponseEntity.ok(response);
	}
	
	
	
}
