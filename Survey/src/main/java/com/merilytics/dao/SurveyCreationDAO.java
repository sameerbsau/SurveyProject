package com.merilytics.dao;

import java.util.List;

import com.merilytics.bo.StaticSurveyTypeBO;
import com.merilytics.bo.SurveyInfoBO;

public interface SurveyCreationDAO {
	
	public List<StaticSurveyTypeBO> surveyTypeList() throws Exception;
	
	public int saveSurveyData(SurveyInfoBO bo) throws Exception;

}
