package com.university.service;

import java.util.List;

import com.university.domain.entity.CourseSubjectBean;

public interface CourseSubjectService {
	void saveOrUpdate(CourseSubjectBean courseSubjectBean);
	List<CourseSubjectBean> list();
	void remove(CourseSubjectBean courseSubjectBean);
	CourseSubjectBean load(int courseSubjectId);
}
