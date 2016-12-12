package com.university.service;

import java.util.List;

import com.university.domain.entity.StudentBean;

public interface StudentService {
	void saveOrUpdate(StudentBean studentBean);
	List<StudentBean> list();
	void remove(StudentBean studentBean);
	StudentBean load(int studentId);
}
