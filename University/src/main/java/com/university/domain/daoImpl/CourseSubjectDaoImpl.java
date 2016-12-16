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

import com.university.domain.dao.CourseSubjectDao;
import com.university.domain.entity.CourseSubjectBean;

@Repository("CourseSubjectDao")
@Transactional
public class CourseSubjectDaoImpl implements CourseSubjectDao{

	public static final String COURSE_SUBJECT_ID = "courseSubjectId";
	public static final String COURSE_BEAN = "courseBean";
	public static final String COURSE_COURSE_ID = "courseBean.courseId";
	public static final String SUBJECT_BEAN = "subjectBean";
	public static final String SUBJECT_SUBJECT_ID = "subjectBean.subjectId";

	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected Session getSession(){
		SessionFactory sessionFactory = getSessionFactory();
		return sessionFactory.getCurrentSession();
	}

	public void saveOrUpdate(CourseSubjectBean courseSubjectBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(courseSubjectBean);
	}

	@SuppressWarnings("unchecked")
	public List<CourseSubjectBean> list() {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(CourseSubjectBean.class)
				.addOrder(Order.asc(COURSE_SUBJECT_ID));
		return cr.list();
	}

	public void remove(CourseSubjectBean courseSubjectBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(courseSubjectBean);
	}

	public CourseSubjectBean load(int courseSubjectId) {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(CourseSubjectBean.class)
				.add(Restrictions.eq(COURSE_SUBJECT_ID, courseSubjectId));
		return (CourseSubjectBean) cr.uniqueResult();
	}
}
