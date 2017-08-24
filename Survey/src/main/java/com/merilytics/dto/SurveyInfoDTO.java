package com.merilytics.dto;

public class SurveyInfoDTO {
	private Integer SIId;
	private String surveyID;
	private String surveyName;
	private String surveyType;
	private String creationDate;
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
	public String getSurveyType() {
		return surveyType;
	}
	public void setSurveyType(String surveyType) {
		this.surveyType = surveyType;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	

}
