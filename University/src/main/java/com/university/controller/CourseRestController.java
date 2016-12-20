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

import com.university.domain.entity.CourseBean;
import com.university.service.CourseService;

@RestController
@RequestMapping(value = "course")
public class CourseRestController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("course/course-form");
        return view;
    }
	
	@RequestMapping(value = "/saveOrUpdateCourse", method=RequestMethod.POST)
	public CourseBean saveOrUpdateCourse(@RequestBody CourseBean courseBean){
		courseService.saveOrUpdate(courseBean);
		return courseBean;
	}
	
	@RequestMapping(value="/listCourse", method=RequestMethod.GET)
	public List<CourseBean> listCourse(){
		List<CourseBean> courseBean = courseService.list();
		return courseBean;
	}
	
	@RequestMapping(value="/loadCourse/{courseId}", method=RequestMethod.GET)
	public CourseBean loadCourse(@PathVariable("courseId") int courseId){
		return courseService.load(courseId);
	}
	
	@RequestMapping(value="/deleteCourse/{courseId}", method=RequestMethod.DELETE)
	public ResponseEntity<CourseBean> deleteCourse(@PathVariable("courseId") int courseId){
		courseService.remove(courseService.load(courseId));
		return new ResponseEntity<CourseBean>(HttpStatus.OK);
	}
}
