
package com.flydubai.reaccom.cp.availability.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SegmentDetail {

    @JsonProperty("LFID")
    private Integer lFID;
    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("DepartureDate")
    private String departureDate;
    @JsonProperty("CarrierCode")
    private String carrierCode;
    @JsonProperty("ArrivalDate")
    private String arrivalDate;
    @JsonProperty("Stops")
    private Integer stops;
    @JsonProperty("FlightTime")
    private Integer flightTime;
    @JsonProperty("AircraftType")
    private String aircraftType;
    @JsonProperty("SellingCarrier")
    private String sellingCarrier;
    @JsonProperty("FlightNum")
    private String flightNum;
    @JsonProperty("OperatingCarrier")
    private String operatingCarrier;
    @JsonProperty("OperatingFlightNum")
    private String operatingFlightNum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LFID")
    public Integer getLFID() {
        return lFID;
    }

    @JsonProperty("LFID")
    public void setLFID(Integer lFID) {
        this.lFID = lFID;
    }

    @JsonProperty("Origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("Origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("Destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("Destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("DepartureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("CarrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("CarrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("ArrivalDate")
    public String getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("ArrivalDate")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("Stops")
    public Integer getStops() {
        return stops;
    }

    @JsonProperty("Stops")
    public void setStops(Integer stops) {
        this.stops = stops;
    }

    @JsonProperty("FlightTime")
    public Integer getFlightTime() {
        return flightTime;
    }

    @JsonProperty("FlightTime")
    public void setFlightTime(Integer flightTime) {
        this.flightTime = flightTime;
    }

    @JsonProperty("AircraftType")
    public String getAircraftType() {
        return aircraftType;
    }

    @JsonProperty("AircraftType")
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @JsonProperty("SellingCarrier")
    public String getSellingCarrier() {
        return sellingCarrier;
    }

    @JsonProperty("SellingCarrier")
    public void setSellingCarrier(String sellingCarrier) {
        this.sellingCarrier = sellingCarrier;
    }

    @JsonProperty("FlightNum")
    public String getFlightNum() {
        return flightNum;
    }

    @JsonProperty("FlightNum")
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    @JsonProperty("OperatingCarrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("OperatingCarrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("OperatingFlightNum")
    public String getOperatingFlightNum() {
        return operatingFlightNum;
    }

    @JsonProperty("OperatingFlightNum")
    public void setOperatingFlightNum(String operatingFlightNum) {
        this.operatingFlightNum = operatingFlightNum;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
