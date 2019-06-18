package com.flydubai.reaccom.inoker.request;

import java.util.List;

import com.flydubai.reaccom.cp.availability.response.FlightAvailabilityResponse;
import com.flydubai.reaccom.cp.availability.response.SegmentDetail;
import com.flydubai.reaccom.model.Flight;

public enum ResponseBuilder {

	INSTANCE;

	public void setFlightAvailability(FlightAvailabilityResponse availability, List<Flight> flights, String fltNum,
			String origin, String dest, String startDate, String endDate, String doo) {
		if (availability != null && availability.getSegmentDetails() != null) {
			List<SegmentDetail> segmentDetails = availability.getSegmentDetails();
			for (SegmentDetail segmentDetail : segmentDetails) {
				Flight flight = new Flight();
				flight.setFltNum(segmentDetail.getFlightNum());
				flight.setOrigin(segmentDetail.getOrigin());
				flight.setDestination(segmentDetail.getDestination());
				flight.setDepDate(segmentDetail.getDepartureDate());
				flight.setDepTime(segmentDetail.getDepartureDate());
				flight.setArrTime(segmentDetail.getArrivalDate());
				flight.setArrDate(segmentDetail.getArrivalDate());
				flight.setAircraftType(segmentDetail.getAircraftType());
				flights.add(flight);
			}
		}

	}

}
