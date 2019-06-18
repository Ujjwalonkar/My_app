package com.flydubai.reaccom.inoker.request;

import java.util.ArrayList;
import java.util.List;

import com.flydubai.reaccom.cp.availability.request.AvailabilityDetail;
import com.flydubai.reaccom.cp.availability.request.CarrierCode;
import com.flydubai.reaccom.cp.availability.request.FlightAvailabilityRequest;

public enum RequestBuilder {

	INSTANCE;
	
	public FlightAvailabilityRequest generateFlightAvailabilityRequest(String fltNum, String origin, String dest, String startDate, String endDate,
			String doo){
		FlightAvailabilityRequest flightAvailabilityRequest = new FlightAvailabilityRequest();
		flightAvailabilityRequest.setSecurityGUID("4cfa4057-8f7f-436c-9286-99a60aa0e329");
		flightAvailabilityRequest.setDayLimit(14);
		flightAvailabilityRequest.setFlightLimit(25);
		flightAvailabilityRequest.setIsInfantCheck("false");
		List<CarrierCode> carrierCodes = new ArrayList<CarrierCode>();
		CarrierCode code = new CarrierCode();
		code.setAccessibleCarrierCode("FZ");
		carrierCodes.add(code);
		flightAvailabilityRequest.setCarrierCodes(carrierCodes);

		flightAvailabilityRequest.setClientIPAddress("127.0.0.1");
		flightAvailabilityRequest.setIataNumberOfRequestor("");
		flightAvailabilityRequest.setInventoryFilterMethod("Available");
		List<AvailabilityDetail> availabilityDetails = new ArrayList<>();
		AvailabilityDetail availabilityDetail = new AvailabilityDetail();
		availabilityDetail.setOrigin(origin);
		availabilityDetail.setDestination(dest);
		availabilityDetail.setUseAirportsNotMetroGroups(true);
		availabilityDetail.setUseAirportsNotMetroGroupsAsRule(true);
		availabilityDetail.setUseAirportsNotMetroGroupsForFrom(true);
		availabilityDetail.setUseAirportsNotMetroGroupsForTo(true);
		availabilityDetail.setDateOfDepartureStart(startDate);
		availabilityDetail.setDateOfDepartureEnd(endDate);
		availabilityDetail.setCabin("");
		availabilityDetail.setOperatingCarrierCode("FZ");
		availabilityDetail.setMarketingCarrierCode("FZ");
		availabilityDetail.setLanguageCode("en");
		availabilityDetail.setTicketPackageID("1");

		availabilityDetails.add(availabilityDetail);
		flightAvailabilityRequest.setAvailabilityDetails(availabilityDetails);
		return flightAvailabilityRequest;
		
	}
	
}
