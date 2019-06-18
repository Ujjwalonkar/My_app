
package com.flydubai.reaccom.cp.availability.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightAvailabilityRequest {

    @JsonProperty("SecurityGUID")
    private String securityGUID;
    @JsonProperty("CarrierCodes")
    private List<CarrierCode> carrierCodes = null;
    @JsonProperty("ClientIPAddress")
    private String clientIPAddress;
    @JsonProperty("IataNumberOfRequestor")
    private String iataNumberOfRequestor;
    @JsonProperty("InventoryFilterMethod")
    private String inventoryFilterMethod;
    @JsonProperty("AvailabilityDetails")
    private List<AvailabilityDetail> availabilityDetails = null;
    @JsonProperty("DayLimit")
    private Integer dayLimit;
    @JsonProperty("FlightLimit")
    private Integer flightLimit;
    @JsonProperty("IsInfantCheck")
    private String isInfantCheck;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SecurityGUID")
    public String getSecurityGUID() {
        return securityGUID;
    }

    @JsonProperty("SecurityGUID")
    public void setSecurityGUID(String securityGUID) {
        this.securityGUID = securityGUID;
    }

    @JsonProperty("CarrierCodes")
    public List<CarrierCode> getCarrierCodes() {
        return carrierCodes;
    }

    @JsonProperty("CarrierCodes")
    public void setCarrierCodes(List<CarrierCode> carrierCodes) {
        this.carrierCodes = carrierCodes;
    }

    @JsonProperty("ClientIPAddress")
    public String getClientIPAddress() {
        return clientIPAddress;
    }

    @JsonProperty("ClientIPAddress")
    public void setClientIPAddress(String clientIPAddress) {
        this.clientIPAddress = clientIPAddress;
    }

    @JsonProperty("IataNumberOfRequestor")
    public String getIataNumberOfRequestor() {
        return iataNumberOfRequestor;
    }

    @JsonProperty("IataNumberOfRequestor")
    public void setIataNumberOfRequestor(String iataNumberOfRequestor) {
        this.iataNumberOfRequestor = iataNumberOfRequestor;
    }

    @JsonProperty("InventoryFilterMethod")
    public String getInventoryFilterMethod() {
        return inventoryFilterMethod;
    }

    @JsonProperty("InventoryFilterMethod")
    public void setInventoryFilterMethod(String inventoryFilterMethod) {
        this.inventoryFilterMethod = inventoryFilterMethod;
    }

    @JsonProperty("AvailabilityDetails")
    public List<AvailabilityDetail> getAvailabilityDetails() {
        return availabilityDetails;
    }

    @JsonProperty("AvailabilityDetails")
    public void setAvailabilityDetails(List<AvailabilityDetail> availabilityDetails) {
        this.availabilityDetails = availabilityDetails;
    }

    @JsonProperty("DayLimit")
    public Integer getDayLimit() {
        return dayLimit;
    }

    @JsonProperty("DayLimit")
    public void setDayLimit(Integer dayLimit) {
        this.dayLimit = dayLimit;
    }

    @JsonProperty("FlightLimit")
    public Integer getFlightLimit() {
        return flightLimit;
    }

    @JsonProperty("FlightLimit")
    public void setFlightLimit(Integer flightLimit) {
        this.flightLimit = flightLimit;
    }

    @JsonProperty("IsInfantCheck")
    public String getIsInfantCheck() {
        return isInfantCheck;
    }

    @JsonProperty("IsInfantCheck")
    public void setIsInfantCheck(String isInfantCheck) {
        this.isInfantCheck = isInfantCheck;
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
