package com.merilytics.controller;

import java.util.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merilytics.dto.StaticSurveyTypeDTO;
import com.merilytics.dto.SurveyInfoDTO;
import com.merilytics.service.SurveyCreationService;

@Controller
public class SurveyCreationController {
	@Resource
	private SurveyCreationService service;

	@RequestMapping(value = "/surveyTypes", method = RequestMethod.GET)
	public ResponseEntity<?> getSurverTypes() {
		System.out.println("in survey types");
		try {
			List<StaticSurveyTypeDTO> listDTO = null;
			listDTO = service.fetchSurveyTypes();
			return new ResponseEntity<>(listDTO, HttpStatus.OK);
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
			return new ResponseEntity<>("dataNOtFound", HttpStatus.BAD_REQUEST);
		}
	}
@RequestMapping(value="/saveSurveyData", method = RequestMethod.POST)
	public ResponseEntity<?> saveSurveyData(@RequestBody Map<String,Object> data){
		System.out.println("data------"+data.get("surveyName"));
		System.out.println("data------"+data.get("surveyData"));
		System.out.println(data);
		//check for null if no survey type is selected
		/*StaticSurveyTypeDTO staticDTO=null;
		staticDTO=(StaticSurveyTypeDTO) data.get("surveyData");
		*/SurveyInfoDTO dto = new SurveyInfoDTO();
		dto.setSurveyID("rand1");
		dto.setSurveyName((String) data.get("surveyName"));
		//change column as per the table
		Map surveyData=(Map) data.get("surveyData");
		dto.setSurveyTypeID((String)surveyData.get("surveyId"));
		dto.setCreationDate(new Timestamp(new Date().getTime()));
		
		Map<String,Object > map=null;
		
		System.out.println(dto);
		try{
			map=	service.saveSurveyData(dto);
			return new ResponseEntity<>(map,HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("{\"status\":\"cannot save internal server error\"}",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
}
