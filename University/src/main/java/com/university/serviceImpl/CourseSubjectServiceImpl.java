package com.university.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.domain.dao.CourseSubjectDao;
import com.university.domain.entity.CourseSubjectBean;
import com.university.service.CourseSubjectService;

@Service
public class CourseSubjectServiceImpl implements CourseSubjectService{

	@Autowired
	private CourseSubjectDao courseSubjectDao;
	
	public void saveOrUpdate(CourseSubjectBean courseSubjectBean) {
		// TODO Auto-generated method stub
		courseSubjectDao.saveOrUpdate(courseSubjectBean);
	}

	public List<CourseSubjectBean> list() {
		// TODO Auto-generated method stub
		return courseSubjectDao.list();
	}

	public void remove(CourseSubjectBean courseSubjectBean) {
		// TODO Auto-generated method stub
		courseSubjectDao.remove(courseSubjectBean);
	}

	public CourseSubjectBean load(int courseSubjectId) {
		// TODO Auto-generated method stub
		return courseSubjectDao.load(courseSubjectId);
	}
	
}
