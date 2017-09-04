package com.merilytics.bo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_survey_info")
public class SurveyInfoBO {
	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
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
	
	}
