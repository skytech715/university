package com.university.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.domain.dao.StudentDao;
import com.university.domain.entity.StudentBean;
import com.university.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	public void saveOrUpdate(StudentBean studentBean) {
		// TODO Auto-generated method stub
		studentDao.saveOrUpdate(studentBean);
	}

	public List<StudentBean> list() {
		// TODO Auto-generated method stub
		return studentDao.list();
	}

	public void remove(StudentBean studentBean) {
		// TODO Auto-generated method stub
		studentDao.remove(studentBean);
	}

	public StudentBean load(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.load(studentId);
	}

}
