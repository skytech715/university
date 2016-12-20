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

import com.university.domain.entity.SubjectBean;
import com.university.service.SubjectService;

@RestController
@RequestMapping(value = "subject")
public class SubjectRestController {

	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("subject/subject-form");
        return view;
    }
	
	@RequestMapping(value = "/saveOrUpdateSubject", method=RequestMethod.POST)
	public SubjectBean saveOrUpdateSubject(@RequestBody SubjectBean subjectBean){
		subjectService.saveOrUpdate(subjectBean);
		return subjectBean;
	}
	
	@RequestMapping(value="/listSubject", method=RequestMethod.GET)
	public List<SubjectBean> listSubject(){
		List<SubjectBean> subjectBean = subjectService.list();
		return subjectBean;
	}
	
	@RequestMapping(value="/loadSubject/{subjectId}", method=RequestMethod.GET)
	public SubjectBean loadSubject(@PathVariable("subjectId") int subjectId){
		return subjectService.load(subjectId);
	}
	
	@RequestMapping(value="/deleteSubject/{subjectId}", method=RequestMethod.DELETE)
	public ResponseEntity<SubjectBean> deleteSubject(@PathVariable("subjectId") int subjectId){
		subjectService.remove(subjectService.load(subjectId));
		return new ResponseEntity<SubjectBean>(HttpStatus.OK);
	}
}
