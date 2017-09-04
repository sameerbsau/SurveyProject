package com.merilytics.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.StaticSurveyTypeBO;
import com.merilytics.bo.SurveyInfoBO;

@Named
public class SurveyCreationDAOImpl implements SurveyCreationDAO {
	@Resource
	private HibernateTemplate ht;

	@Override
	public List<StaticSurveyTypeBO> surveyTypeList() throws Exception {
		List<StaticSurveyTypeBO>  listBO=null;
		listBO=	(List<StaticSurveyTypeBO>) ht.find("from StaticSurveyTypeBO");
		return listBO;
	}

	@Override
	@Transactional
	public int saveSurveyData(SurveyInfoBO bo) throws Exception {
		/*SessionFactory sf = ht.getSessionFactory();
		Session session = sf.openSession();*/
		
		
		int surveyId;
		surveyId=(int) ht.save(bo);
		return surveyId;
	}

}
