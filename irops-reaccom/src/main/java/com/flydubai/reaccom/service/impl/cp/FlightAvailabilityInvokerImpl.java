package com.flydubai.reaccom.service.impl.cp;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flydubai.reaccom.config.ReaccomConfig;
import com.flydubai.reaccom.cp.availability.request.FlightAvailabilityRequest;
import com.flydubai.reaccom.cp.availability.response.FlightAvailabilityResponse;
import com.flydubai.reaccom.inoker.ResourceRequester;
import com.flydubai.reaccom.inoker.request.RequestBuilder;
import com.flydubai.reaccom.inoker.request.ResponseBuilder;
import com.flydubai.reaccom.model.Flight;
import com.flydubai.reaccom.service.ReaccomServiceInvoker;

@Service("fltAvailability")
public class FlightAvailabilityInvokerImpl implements ReaccomServiceInvoker {

	@Override
	public void invokeAndEnrichResponse(String fltNum, String origin, String dest, String startDate, String endDate,
			String doo, List<Flight> flights) {

		FlightAvailabilityRequest flightAvailabilityRequest = RequestBuilder.INSTANCE
				.generateFlightAvailabilityRequest(fltNum, origin, dest, startDate, endDate, doo);

		ResponseEntity<FlightAvailabilityResponse> availabilityResponse = ResourceRequester.INSTANCE.invokePostRequest(
				FlightAvailabilityResponse.class, ReaccomConfig.INSTANCE.getFlightAvailabilityUrl(),
				flightAvailabilityRequest, null);
		FlightAvailabilityResponse availability = availabilityResponse.getBody();

		ResponseBuilder.INSTANCE.setFlightAvailability(availability, flights, fltNum, origin, dest, startDate, endDate,
				doo);

	}

}
