package com.merilytics.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.merilytics.bo.StaticSurveyTypeBO;
import com.merilytics.bo.SurveyInfoBO;
import com.merilytics.dao.SurveyCreationDAO;
import com.merilytics.dto.StaticSurveyTypeDTO;
import com.merilytics.dto.SurveyInfoDTO;
@Named
public class SurveyCreationServiceImpl implements SurveyCreationService{
@Resource
	private SurveyCreationDAO dao;
	@Override
	public List<StaticSurveyTypeDTO>  fetchSurveyTypes() throws Exception {
		List<StaticSurveyTypeBO> listBO=null;
		List<StaticSurveyTypeDTO> listDTO=null;
		StaticSurveyTypeDTO dto=null;
		listDTO= new ArrayList<StaticSurveyTypeDTO>();
		listBO=	dao.surveyTypeList();
		for(StaticSurveyTypeBO bo:listBO){
			dto= new StaticSurveyTypeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}
		return listDTO;
	}
	@Override
	public Map<String, Object> saveSurveyData(SurveyInfoDTO dto) throws Exception {
		
		SurveyInfoBO bo = null;
		int surveyPk=0;
		bo=new SurveyInfoBO();
		BeanUtils.copyProperties(dto, bo);
		surveyPk=dao.saveSurveyData(bo);
		Map<String,Object> surveyInfo= new LinkedHashMap<String,Object>();
		surveyInfo.put("surveyId", surveyPk);
		
		return surveyInfo;
	}
	

}
