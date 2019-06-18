package com.flydubai.reaccom.model;

import java.io.Serializable;
import java.util.Map;

public class Flight implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fltNum;
	private String depDate;
	private String arrDate;
	private String origin;
	private String destination;
	private String depTime;
	private String arrTime;
	private String aircraftType;
	private String flightStatus;
	private Integer totalPax;
	private Integer totalPtpPax;
	private Integer totalCnxPax;
	private Integer totalSeatAvailable;
	private Integer totalPtpPaxJ;
	private Integer totalPtpPaxY;
	private Integer totalCnxPaxJ;
	private Integer totalCnxPaxY;
	private Integer totalSeatAvailableJ;
	private Integer totalSeatAvailableY;
	private Map<String, String> additionalProperties;
	private Map<String, PnrGroup> pnrGroups;

	public String getFltNum() {
		return fltNum;
	}

	public void setFltNum(String fltNum) {
		this.fltNum = fltNum;
	}

	public String getDepDate() {
		return depDate;
	}

	public void setDepDate(String arrDate) {
		this.depDate = arrDate;
	}

	public String getArrDate() {
		return arrDate;
	}

	public void setArrDate(String arrDate) {
		this.depDate = arrDate;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getArrTime() {
		return arrTime;
	}

	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}

	public Integer getTotalPax() {
		return totalPax;
	}

	public void setTotalPax(Integer totalPax) {
		this.totalPax = totalPax;
	}

	public Integer getTotalPtpPax() {
		return totalPtpPax;
	}

	public void setTotalPtpPax(Integer totalPtpPax) {
		this.totalPtpPax = totalPtpPax;
	}

	public Integer getTotalCnxPax() {
		return totalCnxPax;
	}

	public void setTotalCnxPax(Integer totalCnxPax) {
		this.totalCnxPax = totalCnxPax;
	}

	public Integer getTotalSeatAvailable() {
		return totalSeatAvailable;
	}

	public void setTotalSeatAvailable(Integer totalSeatAvailable) {
		this.totalSeatAvailable = totalSeatAvailable;
	}

	public Integer getTotalPtpPaxJ() {
		return totalPtpPaxJ;
	}

	public void setTotalPtpPaxJ(Integer totalPtpPaxJ) {
		this.totalPtpPaxJ = totalPtpPaxJ;
	}

	public Integer getTotalPtpPaxY() {
		return totalPtpPaxY;
	}

	public void setTotalPtpPaxY(Integer totalPtpPaxY) {
		this.totalPtpPaxY = totalPtpPaxY;
	}

	public Integer getTotalCnxPaxJ() {
		return totalCnxPaxJ;
	}

	public void setTotalCnxPaxJ(Integer totalCnxPaxJ) {
		this.totalCnxPaxJ = totalCnxPaxJ;
	}

	public Integer getTotalCnxPaxY() {
		return totalCnxPaxY;
	}

	public void setTotalCnxPaxY(Integer totalCnxPaxY) {
		this.totalCnxPaxY = totalCnxPaxY;
	}

	public Integer getTotalSeatAvailableJ() {
		return totalSeatAvailableJ;
	}

	public void setTotalSeatAvailableJ(Integer totalSeatAvailableJ) {
		this.totalSeatAvailableJ = totalSeatAvailableJ;
	}

	public Integer getTotalSeatAvailableY() {
		return totalSeatAvailableY;
	}

	public void setTotalSeatAvailableY(Integer totalSeatAvailableY) {
		this.totalSeatAvailableY = totalSeatAvailableY;
	}

	public Map<String, String> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, String> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	public Map<String, PnrGroup> getPnrGroups() {
		return pnrGroups;
	}

	public void setPnrGroups(Map<String, PnrGroup> pnrGroups) {
		this.pnrGroups = pnrGroups;
	}

}
