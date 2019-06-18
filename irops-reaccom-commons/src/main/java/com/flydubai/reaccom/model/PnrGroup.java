package com.flydubai.reaccom.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PnrGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String groupKey;

	private String fltNum;
	private String depDate;
	private String depTime;	
	private String segment;
	private Boolean isCnxFlt;
	private Integer totalPaxJ;
	private Integer totalPaxY;
	private Map<String,String> additionalProperties;
	
	private List<Pax>paxList;
	
	public String getGroupKey() {
		return groupKey;
	}

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
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

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public Boolean getIsCnxFlt() {
		return isCnxFlt;
	}

	public void setIsCnxFlt(Boolean isCnxFlt) {
		this.isCnxFlt = isCnxFlt;
	}

	public Integer getTotalPaxJ() {
		return totalPaxJ;
	}

	public void setTotalPaxJ(Integer totalPaxJ) {
		this.totalPaxJ = totalPaxJ;
	}

	public Integer getTotalPaxY() {
		return totalPaxY;
	}

	public void setTotalPaxY(Integer totalPaxY) {
		this.totalPaxY = totalPaxY;
	}

	public Map<String, String> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, String> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	public List<Pax> getPaxList() {
		return paxList;
	}

	public void setPaxList(List<Pax> paxList) {
		this.paxList = paxList;
	}


}
