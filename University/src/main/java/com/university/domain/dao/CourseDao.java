package com.university.domain.dao;

import java.util.List;

import com.university.domain.entity.CourseBean;

public interface CourseDao {
	void saveOrUpdate(CourseBean courseBean);
	List<CourseBean> list();
	void remove(CourseBean courseBean);
	CourseBean load(int course_id);
}
