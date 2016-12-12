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

import com.university.domain.dao.CourseDao;
import com.university.domain.entity.CourseBean;

@Repository("CourseDao")
@Transactional
public class CourseDaoImpl implements CourseDao{
	
	public static final String COURSE_ID = "courseId";
	public static final String COURSE_NAME = "name";
	public static final String COURSE_LEVEL = "level";
	public static final String COURSE_YEAR_TO_FINISH = "year_to_finish";
	
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	protected Session getSession(){
		SessionFactory sessionFactory = getSessionFactory();
		return sessionFactory.getCurrentSession();
	}

	public void saveOrUpdate(CourseBean courseBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(courseBean);
	}

	@SuppressWarnings("unchecked")
	public List<CourseBean> list() {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(CourseBean.class)
				.addOrder(Order.asc("courseId"));
		return cr.list();
	}

	public void remove(CourseBean courseBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(courseBean);
	}

	public CourseBean load(int courseId) {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(CourseBean.class)
				.add(Restrictions.eq(COURSE_ID, courseId));
		return (CourseBean) cr.uniqueResult();
	}

}
