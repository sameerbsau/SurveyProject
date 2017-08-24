package com.merilytics.bo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @project Survey
 * @author 21258
 * @timeAndYear 5:09:19 PM 22-Aug-2017
 * @description 
 * 
 */
@Entity
@Table(name="tbl_questions_info")
public class QuestionsInfoBO {
@Id
	private Integer qsId;
	private String surveyID;
	private String questionId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String option5;
	private String cycle;
	private String typeOfSurvey;
	private Timestamp creationDate;
	private Timestamp updationDate;
	private String createdBy;
	private String updatedBy;
	public Integer getQsId() {
		return qsId;
	}
	public void setQsId(Integer qsId) {
		this.qsId = qsId;
	}
	public String getSurveyID() {
		return surveyID;
	}
	public void setSurveyID(String surveyID) {
		this.surveyID = surveyID;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getOption5() {
		return option5;
	}
	public void setOption5(String option5) {
		this.option5 = option5;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public String getTypeOfSurvey() {
		return typeOfSurvey;
	}
	public void setTypeOfSurvey(String typeOfSurvey) {
		this.typeOfSurvey = typeOfSurvey;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public Timestamp getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(Timestamp updationDate) {
		this.updationDate = updationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
