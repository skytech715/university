package com.university.domain.dao;

import java.util.List;

import com.university.domain.entity.StudentBean;

public interface StudentDao {
	void saveOrUpdate(StudentBean studentBean);
	List<StudentBean> list();
	void remove(StudentBean studentBean);
	StudentBean load(int studentId);
}
