package com.flydubai.reaccom.config;

public enum ReaccomConfig {
	
	INSTANCE;
	
	public String getFlightAvailabilityUrl(){
		return "http://172.28.14.23/FlightsAvailability.svc/GetFlightsAvailability";
	}
	
	public String getPaxSummaryUrl(){
		return "http://qa4sprintcheckin.flydubai.com/api/v1/FZ/paxJourneys/";
	}
	
	

}
