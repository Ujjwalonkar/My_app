
package com.flydubai.reaccom.dcs.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaxSummaryResponse {

    private Integer paxJourneyID;
    private Pax pax;
    private Flight flight;
    private String seatNum;
    private Integer seqNum;
    private String pnrNum;
    private Integer resPaxID;
    private String tktNum;
    private Priority priority;
    private Integer poolID;
    private Integer poolHeadID;
    private Boolean isPrimaryPax;
    private Integer parentID;
    private Integer totBagPieces;
    private Integer totBagWeight;
    private Integer handBagWeight;
    private Inbound inbound;
    @JsonProperty("class")
    private String _class;
    private Integer paxStatusID;
    private Boolean transitDeboarded;
    private Integer checkinChannelID;
    private Integer apisChannelID;
    private List<String> serviceCodes = null;
    private List<Object> checkinComments = null;
    private List<Object> gateComments = null;
    private List<Object> sysGateCommentTypes = null;
    private PrimaryDoc primaryDoc;
    private List<Object> tagLoadingLoc = null;
    private String groupCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getPaxJourneyID() {
        return paxJourneyID;
    }

    public void setPaxJourneyID(Integer paxJourneyID) {
        this.paxJourneyID = paxJourneyID;
    }

    public Pax getPax() {
        return pax;
    }

    public void setPax(Pax pax) {
        this.pax = pax;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public String getPnrNum() {
        return pnrNum;
    }

    public void setPnrNum(String pnrNum) {
        this.pnrNum = pnrNum;
    }

    public Integer getResPaxID() {
        return resPaxID;
    }

    public void setResPaxID(Integer resPaxID) {
        this.resPaxID = resPaxID;
    }

    public String getTktNum() {
        return tktNum;
    }

    public void setTktNum(String tktNum) {
        this.tktNum = tktNum;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Integer getPoolID() {
        return poolID;
    }

    public void setPoolID(Integer poolID) {
        this.poolID = poolID;
    }

    public Integer getPoolHeadID() {
        return poolHeadID;
    }

    public void setPoolHeadID(Integer poolHeadID) {
        this.poolHeadID = poolHeadID;
    }

    public Boolean getIsPrimaryPax() {
        return isPrimaryPax;
    }

    public void setIsPrimaryPax(Boolean isPrimaryPax) {
        this.isPrimaryPax = isPrimaryPax;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public Integer getTotBagPieces() {
        return totBagPieces;
    }

    public void setTotBagPieces(Integer totBagPieces) {
        this.totBagPieces = totBagPieces;
    }

    public Integer getTotBagWeight() {
        return totBagWeight;
    }

    public void setTotBagWeight(Integer totBagWeight) {
        this.totBagWeight = totBagWeight;
    }

    public Integer getHandBagWeight() {
        return handBagWeight;
    }

    public void setHandBagWeight(Integer handBagWeight) {
        this.handBagWeight = handBagWeight;
    }

    public Inbound getInbound() {
        return inbound;
    }

    public void setInbound(Inbound inbound) {
        this.inbound = inbound;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Integer getPaxStatusID() {
        return paxStatusID;
    }

    public void setPaxStatusID(Integer paxStatusID) {
        this.paxStatusID = paxStatusID;
    }

    public Boolean getTransitDeboarded() {
        return transitDeboarded;
    }

    public void setTransitDeboarded(Boolean transitDeboarded) {
        this.transitDeboarded = transitDeboarded;
    }

    public Integer getCheckinChannelID() {
        return checkinChannelID;
    }

    public void setCheckinChannelID(Integer checkinChannelID) {
        this.checkinChannelID = checkinChannelID;
    }

    public Integer getApisChannelID() {
        return apisChannelID;
    }

    public void setApisChannelID(Integer apisChannelID) {
        this.apisChannelID = apisChannelID;
    }

    public List<String> getServiceCodes() {
        return serviceCodes;
    }

    public void setServiceCodes(List<String> serviceCodes) {
        this.serviceCodes = serviceCodes;
    }

    public List<Object> getCheckinComments() {
        return checkinComments;
    }

    public void setCheckinComments(List<Object> checkinComments) {
        this.checkinComments = checkinComments;
    }

    public List<Object> getGateComments() {
        return gateComments;
    }

    public void setGateComments(List<Object> gateComments) {
        this.gateComments = gateComments;
    }

    public List<Object> getSysGateCommentTypes() {
        return sysGateCommentTypes;
    }

    public void setSysGateCommentTypes(List<Object> sysGateCommentTypes) {
        this.sysGateCommentTypes = sysGateCommentTypes;
    }

    public PrimaryDoc getPrimaryDoc() {
        return primaryDoc;
    }

    public void setPrimaryDoc(PrimaryDoc primaryDoc) {
        this.primaryDoc = primaryDoc;
    }

    public List<Object> getTagLoadingLoc() {
        return tagLoadingLoc;
    }

    public void setTagLoadingLoc(List<Object> tagLoadingLoc) {
        this.tagLoadingLoc = tagLoadingLoc;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
