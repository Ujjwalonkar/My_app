
package com.flydubai.reaccom.cp.availability.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LegDetail {

    @JsonProperty("PFID")
    private Integer pFID;
    @JsonProperty("DepartureDate")
    private String departureDate;
    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("FlightNum")
    private String flightNum;
    @JsonProperty("International")
    private Boolean international;
    @JsonProperty("ArrivalDate")
    private String arrivalDate;
    @JsonProperty("FlightTime")
    private Integer flightTime;
    @JsonProperty("OperatingCarrier")
    private String operatingCarrier;
    @JsonProperty("FromTerminal")
    private String fromTerminal;
    @JsonProperty("ToTerminal")
    private String toTerminal;
    @JsonProperty("Equipment")
    private String equipment;
    @JsonProperty("GeneralEquipmentType")
    private String generalEquipmentType;
    @JsonProperty("Miles")
    private Integer miles;
    @JsonProperty("HiddenStops")
    private Integer hiddenStops;
    @JsonProperty("ElapsedTime")
    private String elapsedTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PFID")
    public Integer getPFID() {
        return pFID;
    }

    @JsonProperty("PFID")
    public void setPFID(Integer pFID) {
        this.pFID = pFID;
    }

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("DepartureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
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

    @JsonProperty("FlightNum")
    public String getFlightNum() {
        return flightNum;
    }

    @JsonProperty("FlightNum")
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    @JsonProperty("International")
    public Boolean getInternational() {
        return international;
    }

    @JsonProperty("International")
    public void setInternational(Boolean international) {
        this.international = international;
    }

    @JsonProperty("ArrivalDate")
    public String getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("ArrivalDate")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("FlightTime")
    public Integer getFlightTime() {
        return flightTime;
    }

    @JsonProperty("FlightTime")
    public void setFlightTime(Integer flightTime) {
        this.flightTime = flightTime;
    }

    @JsonProperty("OperatingCarrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("OperatingCarrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("FromTerminal")
    public String getFromTerminal() {
        return fromTerminal;
    }

    @JsonProperty("FromTerminal")
    public void setFromTerminal(String fromTerminal) {
        this.fromTerminal = fromTerminal;
    }

    @JsonProperty("ToTerminal")
    public String getToTerminal() {
        return toTerminal;
    }

    @JsonProperty("ToTerminal")
    public void setToTerminal(String toTerminal) {
        this.toTerminal = toTerminal;
    }

    @JsonProperty("Equipment")
    public String getEquipment() {
        return equipment;
    }

    @JsonProperty("Equipment")
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("GeneralEquipmentType")
    public String getGeneralEquipmentType() {
        return generalEquipmentType;
    }

    @JsonProperty("GeneralEquipmentType")
    public void setGeneralEquipmentType(String generalEquipmentType) {
        this.generalEquipmentType = generalEquipmentType;
    }

    @JsonProperty("Miles")
    public Integer getMiles() {
        return miles;
    }

    @JsonProperty("Miles")
    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    @JsonProperty("HiddenStops")
    public Integer getHiddenStops() {
        return hiddenStops;
    }

    @JsonProperty("HiddenStops")
    public void setHiddenStops(Integer hiddenStops) {
        this.hiddenStops = hiddenStops;
    }

    @JsonProperty("ElapsedTime")
    public String getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("ElapsedTime")
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
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
