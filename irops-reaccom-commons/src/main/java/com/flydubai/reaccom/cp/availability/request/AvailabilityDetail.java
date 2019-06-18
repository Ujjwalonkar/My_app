
package com.flydubai.reaccom.cp.availability.request;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AvailabilityDetail {

    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("UseAirportsNotMetroGroups")
    private Boolean useAirportsNotMetroGroups;
    @JsonProperty("UseAirportsNotMetroGroupsAsRule")
    private Boolean useAirportsNotMetroGroupsAsRule;
    @JsonProperty("UseAirportsNotMetroGroupsForFrom")
    private Boolean useAirportsNotMetroGroupsForFrom;
    @JsonProperty("UseAirportsNotMetroGroupsForTo")
    private Boolean useAirportsNotMetroGroupsForTo;
    @JsonProperty("DateOfDepartureStart")
    private String dateOfDepartureStart;
    @JsonProperty("DateOfDepartureEnd")
    private String dateOfDepartureEnd;
    @JsonProperty("Cabin")
    private String cabin;
    @JsonProperty("OperatingCarrierCode")
    private String operatingCarrierCode;
    @JsonProperty("MarketingCarrierCode")
    private String marketingCarrierCode;
    @JsonProperty("LanguageCode")
    private String languageCode;
    @JsonProperty("TicketPackageID")
    private String ticketPackageID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("UseAirportsNotMetroGroups")
    public Boolean getUseAirportsNotMetroGroups() {
        return useAirportsNotMetroGroups;
    }

    @JsonProperty("UseAirportsNotMetroGroups")
    public void setUseAirportsNotMetroGroups(Boolean useAirportsNotMetroGroups) {
        this.useAirportsNotMetroGroups = useAirportsNotMetroGroups;
    }

    @JsonProperty("UseAirportsNotMetroGroupsAsRule")
    public Boolean getUseAirportsNotMetroGroupsAsRule() {
        return useAirportsNotMetroGroupsAsRule;
    }

    @JsonProperty("UseAirportsNotMetroGroupsAsRule")
    public void setUseAirportsNotMetroGroupsAsRule(Boolean useAirportsNotMetroGroupsAsRule) {
        this.useAirportsNotMetroGroupsAsRule = useAirportsNotMetroGroupsAsRule;
    }

    @JsonProperty("UseAirportsNotMetroGroupsForFrom")
    public Boolean getUseAirportsNotMetroGroupsForFrom() {
        return useAirportsNotMetroGroupsForFrom;
    }

    @JsonProperty("UseAirportsNotMetroGroupsForFrom")
    public void setUseAirportsNotMetroGroupsForFrom(Boolean useAirportsNotMetroGroupsForFrom) {
        this.useAirportsNotMetroGroupsForFrom = useAirportsNotMetroGroupsForFrom;
    }

    @JsonProperty("UseAirportsNotMetroGroupsForTo")
    public Boolean getUseAirportsNotMetroGroupsForTo() {
        return useAirportsNotMetroGroupsForTo;
    }

    @JsonProperty("UseAirportsNotMetroGroupsForTo")
    public void setUseAirportsNotMetroGroupsForTo(Boolean useAirportsNotMetroGroupsForTo) {
        this.useAirportsNotMetroGroupsForTo = useAirportsNotMetroGroupsForTo;
    }

    @JsonProperty("DateOfDepartureStart")
    public String getDateOfDepartureStart() {
        return dateOfDepartureStart;
    }

    @JsonProperty("DateOfDepartureStart")
    public void setDateOfDepartureStart(String dateOfDepartureStart) {
        this.dateOfDepartureStart = dateOfDepartureStart;
    }

    @JsonProperty("DateOfDepartureEnd")
    public String getDateOfDepartureEnd() {
        return dateOfDepartureEnd;
    }

    @JsonProperty("DateOfDepartureEnd")
    public void setDateOfDepartureEnd(String dateOfDepartureEnd) {
        this.dateOfDepartureEnd = dateOfDepartureEnd;
    }

    @JsonProperty("Cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("Cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("OperatingCarrierCode")
    public String getOperatingCarrierCode() {
        return operatingCarrierCode;
    }

    @JsonProperty("OperatingCarrierCode")
    public void setOperatingCarrierCode(String operatingCarrierCode) {
        this.operatingCarrierCode = operatingCarrierCode;
    }

    @JsonProperty("MarketingCarrierCode")
    public String getMarketingCarrierCode() {
        return marketingCarrierCode;
    }

    @JsonProperty("MarketingCarrierCode")
    public void setMarketingCarrierCode(String marketingCarrierCode) {
        this.marketingCarrierCode = marketingCarrierCode;
    }

    @JsonProperty("LanguageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("LanguageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("TicketPackageID")
    public String getTicketPackageID() {
        return ticketPackageID;
    }

    @JsonProperty("TicketPackageID")
    public void setTicketPackageID(String ticketPackageID) {
        this.ticketPackageID = ticketPackageID;
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
