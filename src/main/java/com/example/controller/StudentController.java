package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

/**
 * The Class StudentController.
 */
@RestController
@RequestMapping("user")
public class StudentController {
	
	/** The student service. */
	@Autowired
	private StudentService studentService;
	
	/**
	 * Gets the all user.
	 *
	 * @return the all user
	 * @throws Exception 
	 */
	@GetMapping("all")
	public List<Student> getAllUser() throws Exception {
		List<Student> list = studentService.findAllUser();
		return list;
	}
}
