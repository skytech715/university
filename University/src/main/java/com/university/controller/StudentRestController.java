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

import com.university.domain.entity.StudentBean;
import com.university.service.CourseService;
import com.university.service.StudentService;

@RestController
@RequestMapping(value = "student")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("student-form");
        return view;
    }
	
	@RequestMapping(value = "/saveStudent/{courseId}", method=RequestMethod.POST)
	public StudentBean saveStudent(@PathVariable("courseId") int courseId, @RequestBody StudentBean studentBean){
		studentBean.setCourseBean(courseService.load(courseId));
		studentService.saveOrUpdate(studentBean);
		return studentBean;
	}
	
	@RequestMapping(value="/updateStudent/{courseId}", method=RequestMethod.POST)
	public StudentBean updateStudent(@PathVariable("courseId") int courseId, @RequestBody StudentBean studentBean){
		studentBean.setCourseBean(courseService.load(courseId));
		studentService.saveOrUpdate(studentBean);
		return studentBean;
	}
	
	@RequestMapping(value="/listStudent", method=RequestMethod.GET)
	public List<StudentBean> listStudent(){
		List<StudentBean> studentBean = studentService.list();
		return studentBean;
	}
	
	@RequestMapping(value="/loadStudent/{studentId}", method=RequestMethod.GET)
	public StudentBean loadStudent(@PathVariable("studentId") int studentId){
		return studentService.load(studentId);
	}
	
	@RequestMapping(value="/deleteStudent/{studentId}", method=RequestMethod.DELETE)
	public ResponseEntity<StudentBean> deleteStudent(@PathVariable("studentId") int studentId){
		studentService.remove(studentService.load(studentId));
		return new ResponseEntity<StudentBean>(HttpStatus.OK);
	}
}
