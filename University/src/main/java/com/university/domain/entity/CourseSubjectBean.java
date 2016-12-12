package com.university.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="course_subject")
@Proxy(lazy=false)
public class CourseSubjectBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7528830789921014595L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_subject_id")
    private int courseSubjectId;
	
	@ManyToOne
	@JoinColumn(name="course_id", referencedColumnName="course_id")
	private CourseBean courseBean;
	
	@ManyToOne
	@JoinColumn(name="subject_id", referencedColumnName="subject_id")
	private SubjectBean subjectBean;

	public int getCourseSubjectId() {
		return courseSubjectId;
	}

	public void setCourseSubjectId(int courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}

	public CourseBean getCourseBean() {
		return courseBean;
	}

	public void setCourseBean(CourseBean courseBean) {
		this.courseBean = courseBean;
	}

	public SubjectBean getSubjectBean() {
		return subjectBean;
	}

	public void setSubjectBean(SubjectBean subjectBean) {
		this.subjectBean = subjectBean;
	}
	
}
