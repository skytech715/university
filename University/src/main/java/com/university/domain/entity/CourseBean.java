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
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="course")
@Proxy(lazy=false)
public class CourseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2311328865850253110L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "level")
	private String level;
	
	@Column(name = "year_to_finish")
	private int yearToFinish;
	
	@OneToMany(mappedBy="courseBean", orphanRemoval=false, cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<StudentBean> studentBean;
	
	@OneToMany(mappedBy="courseBean", orphanRemoval=false, cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<CourseSubjectBean> courseSubjectBean;
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getYearToFinish() {
		return yearToFinish;
	}

	public void setYearToFinish(int yearToFinish) {
		this.yearToFinish = yearToFinish;
	}
	
}
