package comp3011.assignment1.model;

public class GlobalStatsResponse {
	private int inputTokens; // Total input tokens consumed
	private int outputTokens; 	// Total output tokens produced
	
	public GlobalStatsResponse(int inputTokens,int outputTokens) {
		this.inputTokens = inputTokens;
		this.outputTokens = outputTokens;
	}
	public int getOutputTokens() {return outputTokens;}
	public int getInputTokens() {return inputTokens;}

}
