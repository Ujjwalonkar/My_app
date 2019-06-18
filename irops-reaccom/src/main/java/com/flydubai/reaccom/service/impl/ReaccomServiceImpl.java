package com.flydubai.reaccom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.flydubai.reaccom.model.Flight;
import com.flydubai.reaccom.model.Flights;
import com.flydubai.reaccom.service.ReaccomService;
import com.flydubai.reaccom.service.ReaccomServiceInvoker;

@Service
public class ReaccomServiceImpl implements ReaccomService {

	@Autowired
	@Qualifier("fltAvailability")
	private ReaccomServiceInvoker flightAvailabilityinvoker;

	@Autowired
	@Qualifier("paxSummary")
	private ReaccomServiceInvoker paxSummaryinvoker;

	@Override
	public Flights getFlightDetails(String fltNum, String origin, String dest, String startDate, String endDate,
			String doo) {

		List<Flight> flights = new ArrayList<>();

		flightAvailabilityinvoker.invokeAndEnrichResponse(fltNum, origin, dest, startDate, endDate, doo, flights);
		paxSummaryinvoker.invokeAndEnrichResponse(fltNum, origin, dest, startDate, endDate, doo, flights);

		Flights result = new Flights();
		result.setFlights(flights);
		return result;
	}

}
