package com.uca.capas.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Student;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message", "Bienvenidos a MVC");
		return mav;
	}
	@RequestMapping(value= "/formData", method= RequestMethod.POST)
	public ModelAndView formData(@RequestParam(value= "name") String name, @RequestParam(value= "lname") String lastName,
			@RequestParam(value= "bdate") Date bDate, @RequestParam(value= "career") String career,
			@RequestParam(value= "experience") String experience) {
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		student.setName(name);
		student.setLastName(lastName);
		student.setbDate(new SimpleDateFormat("MM/dd/yyyy").format(bDate).toString());
		student.setCareer(career);
		student.setExperience(experience);
		mav.setViewName("Main2");
		mav.addObject("student", student);
		return mav;
	}
	@RequestMapping("/f")
	@ResponseBody
	public Student studentF() {
		Student student = new Student("Roxana", "Cortéz", "14/11/1992", "Ing informatica", "Estudiante");
		return student;
	}
}
