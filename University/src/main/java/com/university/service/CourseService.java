package com.university.service;

import java.util.List;

import com.university.domain.entity.CourseBean;

public interface CourseService {
	void saveOrUpdate(CourseBean courseBean);
	List<CourseBean> list();
	void remove(CourseBean courseBean);
	CourseBean load(int courseId);
}
