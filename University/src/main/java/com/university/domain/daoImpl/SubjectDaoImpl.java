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

import com.university.domain.dao.SubjectDao;
import com.university.domain.entity.SubjectBean;

@Repository("SubjectDao")
@Transactional
public class SubjectDaoImpl implements SubjectDao{
	
	public static final String SUBJECT_ID = "subjectId";
	public static final String SUBJECT_NAME = "name";
	public static final String SUBJECT_CODE = "code";
	public static final String SUBJECT_CREDIT_HOUR = "creditHour";

	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	protected Session getSession(){
		SessionFactory sessionFactory = getSessionFactory();
		return sessionFactory.getCurrentSession();
	}

	public void saveOrUpdate(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(subjectBean);
	}

	@SuppressWarnings("unchecked")
	public List<SubjectBean> list() {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(SubjectBean.class)
				.addOrder(Order.asc("subject_id"));
		return cr.list();
	}

	public void remove(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(subjectBean);
	}

	public SubjectBean load(int subjectId) {
		// TODO Auto-generated method stub
		Criteria cr = getSession().createCriteria(SubjectBean.class)
				.add(Restrictions.eq(SUBJECT_ID, subjectId));
		return (SubjectBean) cr.uniqueResult();
	}
	
}
