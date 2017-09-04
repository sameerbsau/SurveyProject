package com.merilytics.service;

import java.util.List;
import java.util.Map;

import com.merilytics.dto.StaticSurveyTypeDTO;
import com.merilytics.dto.SurveyInfoDTO;

/**
 * @author sameer
 *
 */
public interface SurveyCreationService {
public List<StaticSurveyTypeDTO> fetchSurveyTypes() throws Exception;
public Map<String,Object> saveSurveyData(SurveyInfoDTO dto) throws Exception;
}
