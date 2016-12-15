package com.university.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.domain.dao.SubjectDao;
import com.university.domain.entity.SubjectBean;
import com.university.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectDao subjectDao;
	
	public void saveOrUpdate(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		subjectDao.saveOrUpdate(subjectBean);
	}

	public List<SubjectBean> list() {
		// TODO Auto-generated method stub
		return subjectDao.list();
	}

	public void remove(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		subjectDao.remove(subjectBean);
	}

	public SubjectBean load(int subjectId) {
		// TODO Auto-generated method stub
		return subjectDao.load(subjectId);
	}

}
