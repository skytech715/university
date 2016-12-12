package com.university.domain.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="subject")
@Proxy(lazy=false)
public class SubjectBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2999549503015072345L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subject_id")
    private int subjectId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "credit_hour")
	private double creditHour;
	
	@OneToMany(mappedBy="subjectBean", orphanRemoval=true, cascade=CascadeType.ALL)
	@JsonIgnore
	private List<CourseSubjectBean> courseSubjectBean;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getCreditHour() {
		return creditHour;
	}

	public void setCreditHour(double creditHour) {
		this.creditHour = creditHour;
	}

	public List<CourseSubjectBean> getCourseSubjectBean() {
		return courseSubjectBean;
	}

	public void setCourseSubjectBean(List<CourseSubjectBean> courseSubjectBean) {
		this.courseSubjectBean = courseSubjectBean;
	}
	
}
