
package com.flydubai.reaccom.dcs.response;

import java.util.HashMap;
import java.util.Map;

public class PrimaryDoc {

    private Integer docTypeID;
    private String docNum;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getDocTypeID() {
        return docTypeID;
    }

    public void setDocTypeID(Integer docTypeID) {
        this.docTypeID = docTypeID;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
