
package com.flydubai.reaccom.cp.availability.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightAvailabilityResponse {

    @JsonProperty("LookToBookID")
    private Object lookToBookID;
    @JsonProperty("RequestedIataNumber")
    private String requestedIataNumber;
    @JsonProperty("RequestedInventoryFilterMethod")
    private Integer requestedInventoryFilterMethod;
    @JsonProperty("RequestedReservationChannel")
    private Integer requestedReservationChannel;
    @JsonProperty("CommissionIncluded")
    private Boolean commissionIncluded;
    @JsonProperty("FlightSegments")
    private List<FlightSegment> flightSegments = null;
    @JsonProperty("SegmentDetails")
    private List<SegmentDetail> segmentDetails = null;
    @JsonProperty("LegDetails")
    private List<LegDetail> legDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LookToBookID")
    public Object getLookToBookID() {
        return lookToBookID;
    }

    @JsonProperty("LookToBookID")
    public void setLookToBookID(Object lookToBookID) {
        this.lookToBookID = lookToBookID;
    }

    @JsonProperty("RequestedIataNumber")
    public String getRequestedIataNumber() {
        return requestedIataNumber;
    }

    @JsonProperty("RequestedIataNumber")
    public void setRequestedIataNumber(String requestedIataNumber) {
        this.requestedIataNumber = requestedIataNumber;
    }

    @JsonProperty("RequestedInventoryFilterMethod")
    public Integer getRequestedInventoryFilterMethod() {
        return requestedInventoryFilterMethod;
    }

    @JsonProperty("RequestedInventoryFilterMethod")
    public void setRequestedInventoryFilterMethod(Integer requestedInventoryFilterMethod) {
        this.requestedInventoryFilterMethod = requestedInventoryFilterMethod;
    }

    @JsonProperty("RequestedReservationChannel")
    public Integer getRequestedReservationChannel() {
        return requestedReservationChannel;
    }

    @JsonProperty("RequestedReservationChannel")
    public void setRequestedReservationChannel(Integer requestedReservationChannel) {
        this.requestedReservationChannel = requestedReservationChannel;
    }

    @JsonProperty("CommissionIncluded")
    public Boolean getCommissionIncluded() {
        return commissionIncluded;
    }

    @JsonProperty("CommissionIncluded")
    public void setCommissionIncluded(Boolean commissionIncluded) {
        this.commissionIncluded = commissionIncluded;
    }

    @JsonProperty("FlightSegments")
    public List<FlightSegment> getFlightSegments() {
        return flightSegments;
    }

    @JsonProperty("FlightSegments")
    public void setFlightSegments(List<FlightSegment> flightSegments) {
        this.flightSegments = flightSegments;
    }

    @JsonProperty("SegmentDetails")
    public List<SegmentDetail> getSegmentDetails() {
        return segmentDetails;
    }

    @JsonProperty("SegmentDetails")
    public void setSegmentDetails(List<SegmentDetail> segmentDetails) {
        this.segmentDetails = segmentDetails;
    }

    @JsonProperty("LegDetails")
    public List<LegDetail> getLegDetails() {
        return legDetails;
    }

    @JsonProperty("LegDetails")
    public void setLegDetails(List<LegDetail> legDetails) {
        this.legDetails = legDetails;
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
