package com.flydubai.reaccom.service;

import java.util.List;

import com.flydubai.reaccom.model.Flight;

public interface ReaccomServiceInvoker {

	public void invokeAndEnrichResponse(String fltNum, String origin, String dest, String startDate, String endDate, String doo,
			List<Flight> flights);

}
