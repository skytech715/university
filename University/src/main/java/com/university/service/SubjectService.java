package com.university.service;

import java.util.List;

import com.university.domain.entity.SubjectBean;

public interface SubjectService {
	void saveOrUpdate(SubjectBean subjectBean);
	List<SubjectBean> list();
	void remove(SubjectBean subjectBean);
	SubjectBean load(int subjectId);
}
