package com.flydubai.reaccom.service;

import com.flydubai.reaccom.model.Flights;


public interface ReaccomService {

	public Flights getFlightDetails(String fltNum, String origin, String dest, String startDate, String endDate, String doo);


}
