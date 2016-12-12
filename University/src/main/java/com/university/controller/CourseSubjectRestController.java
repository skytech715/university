package com.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.university.domain.entity.CourseSubjectBean;
import com.university.service.CourseSubjectService;

@RestController
@RequestMapping(value = "course/subject")
public class CourseSubjectRestController {

	@Autowired
	private CourseSubjectService courseSubjectService;
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("course-subject-form");
        return view;
    }
	
	@RequestMapping(value = "/saveCourseSubject", method=RequestMethod.POST)
	public CourseSubjectBean saveCourseSubject(@RequestBody CourseSubjectBean courseSubjectBean){
		courseSubjectService.saveOrUpdate(courseSubjectBean);
		return courseSubjectBean;
	}
	
	@RequestMapping(value="/updateCourseSubject", method=RequestMethod.POST)
	public CourseSubjectBean updateCourseSubject(@RequestBody CourseSubjectBean courseSubjectBean){
		courseSubjectService.saveOrUpdate(courseSubjectBean);
		return courseSubjectBean;
	}
	
	@RequestMapping(value="/listCourseSubject", method=RequestMethod.GET)
	public List<CourseSubjectBean> listCourseSubject(){
		List<CourseSubjectBean> courseSubjectBean = courseSubjectService.list();
		return courseSubjectBean;
	}
	
	@RequestMapping(value="/loadCourseSubject/{courseSubjectId}", method=RequestMethod.GET)
	public CourseSubjectBean loadCourseSubject(@PathVariable("courseSubjectId") int courseSubjectId){
		return courseSubjectService.load(courseSubjectId);
	}
	
	@RequestMapping(value="/deleteCourseSubject/{courseSubjectId}", method=RequestMethod.DELETE)
	public ResponseEntity<CourseSubjectBean> deleteCourseSubject(@PathVariable("courseSubjectId") int courseSubjectId){
		courseSubjectService.remove(courseSubjectService.load(courseSubjectId));
		return new ResponseEntity<CourseSubjectBean>(HttpStatus.OK);
	}
}
