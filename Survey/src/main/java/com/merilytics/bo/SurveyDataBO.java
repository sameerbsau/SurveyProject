package com.merilytics.bo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @project Survey
 * @author 21258
 * @timeAndYear 10:56:41 AM 24-Aug-2017
 * @description
 * 
 */
@Entity
@Table(name = "tbl_survey_data")

public class SurveyDataBO {
	@Id
	private Integer sId;
	private String surveyID;
	private String requestId;
	private String questionId;
	private Boolean option1;
	private Boolean option2;
	private Boolean option3;
	private Boolean option4;
	private Boolean option5;
	private Timestamp creationDate;
	private String notes;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getSurveyID() {
		return surveyID;
	}
	public void setSurveyID(String surveyID) {
		this.surveyID = surveyID;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public Boolean getOption1() {
		return option1;
	}
	public void setOption1(Boolean option1) {
		this.option1 = option1;
	}
	public Boolean getOption2() {
		return option2;
	}
	public void setOption2(Boolean option2) {
		this.option2 = option2;
	}
	public Boolean getOption3() {
		return option3;
	}
	public void setOption3(Boolean option3) {
		this.option3 = option3;
	}
	public Boolean getOption4() {
		return option4;
	}
	public void setOption4(Boolean option4) {
		this.option4 = option4;
	}
	public Boolean getOption5() {
		return option5;
	}
	public void setOption5(Boolean option5) {
		this.option5 = option5;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

}
