package com.university.domain.dao;

import java.util.List;

import com.university.domain.entity.SubjectBean;

public interface SubjectDao {
	void saveOrUpdate(SubjectBean subjectBean);
	List<SubjectBean> list();
	void remove(SubjectBean subjectBean);
	SubjectBean load(int subjectId);
}
