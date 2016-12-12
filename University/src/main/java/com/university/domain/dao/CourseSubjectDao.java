package com.university.domain.dao;

import java.util.List;

import com.university.domain.entity.CourseSubjectBean;

public interface CourseSubjectDao {
	void saveOrUpdate(CourseSubjectBean courseSubjectBean);
	List<CourseSubjectBean> list();
	void remove(CourseSubjectBean courseSubjectBean);
	CourseSubjectBean load(int courseSubjectId);
}
