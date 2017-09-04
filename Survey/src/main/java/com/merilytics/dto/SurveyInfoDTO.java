package com.merilytics.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class SurveyInfoDTO implements Serializable {
	private Integer SIId;
	private String surveyID;
	private String surveyName;
	private String surveyTypeID;
	private Timestamp creationDate;
	public Integer getSIId() {
		return SIId;
	}
	public void setSIId(Integer sIId) {
		SIId = sIId;
	}
	public String getSurveyID() {
		return surveyID;
	}
	public void setSurveyID(String surveyID) {
		this.surveyID = surveyID;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}
	public String getSurveyTypeID() {
		return surveyTypeID;
	}
	public void setSurveyTypeID(String surveyTypeID) {
		this.surveyTypeID = surveyTypeID;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "SurveyInfoDTO [SIId=" + SIId + ", surveyID=" + surveyID + ", surveyName=" + surveyName
				+ ", surveyTypeID=" + surveyTypeID + ", creationDate=" + creationDate + "]";
	}
	
	}
