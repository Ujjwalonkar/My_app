
package com.flydubai.reaccom.cp.availability.request;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CarrierCode {

    @JsonProperty("AccessibleCarrierCode")
    private String accessibleCarrierCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AccessibleCarrierCode")
    public String getAccessibleCarrierCode() {
        return accessibleCarrierCode;
    }

    @JsonProperty("AccessibleCarrierCode")
    public void setAccessibleCarrierCode(String accessibleCarrierCode) {
        this.accessibleCarrierCode = accessibleCarrierCode;
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
