package com.example.dao;

import java.util.List;

import com.example.entity.Student;

/**
 * The Interface StudentDao.
 */
public interface StudentDao {
	
	/**
	 * Find all user in database.
	 *
	 * @return the list
	 */
	List<Student> findAllUser();
}
