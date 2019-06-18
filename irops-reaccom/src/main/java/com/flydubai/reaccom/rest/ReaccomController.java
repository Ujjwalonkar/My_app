package com.flydubai.reaccom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flydubai.reaccom.model.Flights;
import com.flydubai.reaccom.service.ReaccomService;

@RestController
public class ReaccomController {
	
	@Autowired
	private ReaccomService reaccomService;

	@RequestMapping(method = RequestMethod.GET, path = "/flights")
	public Flights fetchFlights(@RequestParam(value = "origin") String origin, @RequestParam(value = "dest") String dest,
			@RequestParam(value = "fltNum") String fltNum, @RequestParam(value = "startDate") String startDate,
			@RequestParam(value = "endDate") String endDate,@RequestParam(value = "doo") String doo) {
		return reaccomService.getFlightDetails(fltNum, origin, dest, startDate, endDate, doo);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/test")
	public String sampleGet(@RequestParam(value = "origin") String origin, @RequestParam(value = "dest") String dest,
			@RequestParam(value = "fltNum") String fltNum, @RequestParam(value = "startDate") String startDate,
			@RequestParam(value = "endDate") String endDate,@RequestParam(value = "doo") String doo) {
		return fltNum+ origin+ dest+ startDate+ endDate+ doo;
	}

}
