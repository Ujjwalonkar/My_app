package com.flydubai.reaccom.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Pax implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String groupKey;

	private String confirmNumber;
	private String paxName;
	private String paxFirstName;
	private String paxLastName;
	private String cabinType;
	private String segment;
	private String ffpid;
	private List<String> ssr;
	private String seatNum;
	private String paxType;// Holiday, EK*,FZ,Codeshare(OAL),Codeshare(FZ),interline
	private boolean isGroupPax;
	private Map<String,String> additionalProperties;
	
	
	public String getGroupKey() {
		return groupKey;
	}
	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}
	public String getConfirmNumber() {
		return confirmNumber;
	}
	public void setConfirmNumber(String confirmNumber) {
		this.confirmNumber = confirmNumber;
	}
	public String getPaxName() {
		return paxName;
	}
	public void setPaxName(String paxName) {
		this.paxName = paxName;
	}
	public String getPaxFirstName() {
		return paxFirstName;
	}
	public void setPaxFirstName(String paxFirstName) {
		this.paxFirstName = paxFirstName;
	}
	public String getPaxLastName() {
		return paxLastName;
	}
	public void setPaxLastName(String paxLastName) {
		this.paxLastName = paxLastName;
	}
	public String getCabinType() {
		return cabinType;
	}
	public void setCabinType(String cabinType) {
		this.cabinType = cabinType;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getFfpid() {
		return ffpid;
	}
	public void setFfpid(String ffpid) {
		this.ffpid = ffpid;
	}
	public List<String> getSsr() {
		return ssr;
	}
	public void setSsr(List<String> ssr) {
		this.ssr = ssr;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	public String getPaxType() {
		return paxType;
	}
	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}
	public boolean isGroupPax() {
		return isGroupPax;
	}
	public void setGroupPax(boolean isGroupPax) {
		this.isGroupPax = isGroupPax;
	}
	public Map<String, String> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, String> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	

}
