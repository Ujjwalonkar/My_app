
package com.flydubai.reaccom.cp.availability.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightSegment {

    @JsonProperty("LFID")
    private Integer lFID;
    @JsonProperty("DepartureDate")
    private String departureDate;
    @JsonProperty("ArrivalDate")
    private String arrivalDate;
    @JsonProperty("LegCount")
    private Integer legCount;
    @JsonProperty("International")
    private Boolean international;
    @JsonProperty("InfantAvailability")
    private Integer infantAvailability;
    @JsonProperty("FlightLegDetails")
    private List<FlightLegDetail> flightLegDetails = null;
    @JsonProperty("Inventory")
    private String inventory;
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

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("DepartureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("ArrivalDate")
    public String getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("ArrivalDate")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("LegCount")
    public Integer getLegCount() {
        return legCount;
    }

    @JsonProperty("LegCount")
    public void setLegCount(Integer legCount) {
        this.legCount = legCount;
    }

    @JsonProperty("International")
    public Boolean getInternational() {
        return international;
    }

    @JsonProperty("International")
    public void setInternational(Boolean international) {
        this.international = international;
    }

    @JsonProperty("InfantAvailability")
    public Integer getInfantAvailability() {
        return infantAvailability;
    }

    @JsonProperty("InfantAvailability")
    public void setInfantAvailability(Integer infantAvailability) {
        this.infantAvailability = infantAvailability;
    }

    @JsonProperty("FlightLegDetails")
    public List<FlightLegDetail> getFlightLegDetails() {
        return flightLegDetails;
    }

    @JsonProperty("FlightLegDetails")
    public void setFlightLegDetails(List<FlightLegDetail> flightLegDetails) {
        this.flightLegDetails = flightLegDetails;
    }

    @JsonProperty("Inventory")
    public String getInventory() {
        return inventory;
    }

    @JsonProperty("Inventory")
    public void setInventory(String inventory) {
        this.inventory = inventory;
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
