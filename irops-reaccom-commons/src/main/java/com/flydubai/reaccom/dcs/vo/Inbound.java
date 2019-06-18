
package com.flydubai.reaccom.dcs.vo;

import java.util.HashMap;
import java.util.Map;

public class Inbound {

    private Boolean tci;
    private Integer paxJourneyID;
    private String carrier;
    private String fltNum;
    private String depDate;
    private String std;
    private String board;
    private String off;
    private String mrktCarrier;
    private String mrktFltNum;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getTci() {
        return tci;
    }

    public void setTci(Boolean tci) {
        this.tci = tci;
    }

    public Integer getPaxJourneyID() {
        return paxJourneyID;
    }

    public void setPaxJourneyID(Integer paxJourneyID) {
        this.paxJourneyID = paxJourneyID;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFltNum() {
        return fltNum;
    }

    public void setFltNum(String fltNum) {
        this.fltNum = fltNum;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public String getMrktCarrier() {
        return mrktCarrier;
    }

    public void setMrktCarrier(String mrktCarrier) {
        this.mrktCarrier = mrktCarrier;
    }

    public String getMrktFltNum() {
        return mrktFltNum;
    }

    public void setMrktFltNum(String mrktFltNum) {
        this.mrktFltNum = mrktFltNum;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
