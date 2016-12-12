package com.university.domain.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.university.domain.dao.StudentDao;
import com.university.domain.entity.StudentBean;

@Repository("StudentDao")
@Transactional
public class StudentDaoImpl implements StudentDao{
	
	public static final String STUDENT_ID = "studentId";
	public static final String STUDENT_NAME = "name";
	public static final String STUDENT_NRIC = "nric";
	public static final String STUDENT_MOBILE_NUMBER = "mobileNumber";
	public static final String COURSE_BEAN = "courseBean";
	public static final String COURSE_COURSE_ID = "courseBean.courseId";

	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	protected Session getSession(){
		SessionFactory sessionFactory = getSessionFactory();
		return sessionFactory.getCurrentSession();
	}

	public void saveOrUpdate(StudentBean studentBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(studentBean);
	}

	@SuppressWarnings("unchecked")
	public List<StudentBean> list() {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(StudentBean.class)
				.addOrder(Order.asc("student_id"));
		return cr.list();
	}

	public void remove(StudentBean studentBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(studentBean);
	}

	public StudentBean load(int studentId) {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(StudentBean.class)
				.add(Restrictions.eq(STUDENT_ID, studentId));
		return (StudentBean) cr.uniqueResult();
	}
}
