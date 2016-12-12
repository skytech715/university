package com.university.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.domain.dao.CourseDao;
import com.university.domain.entity.CourseBean;
import com.university.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	public void saveOrUpdate(CourseBean courseBean) {
		// TODO Auto-generated method stub
		courseDao.saveOrUpdate(courseBean);
	}

	public List<CourseBean> list() {
		// TODO Auto-generated method stub
		return courseDao.list();
	}

	public void remove(CourseBean courseBean) {
		// TODO Auto-generated method stub
		courseDao.remove(courseBean);
	}

	public CourseBean load(int courseId) {
		// TODO Auto-generated method stub
		return courseDao.load(courseId);
	}

}
