package com.example.service;

import java.util.List;

import com.example.entity.Student;

/**
 * The Interface StudentService.
 */
public interface StudentService {
	
	/**
	 * Find all user in database.
	 *
	 * @return the list
	 */
	List<Student> findAllUser();
}
