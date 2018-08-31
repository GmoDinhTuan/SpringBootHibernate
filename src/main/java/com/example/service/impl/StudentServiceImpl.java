package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.StudentDao;
import com.example.entity.Student;
import com.example.service.StudentService;

/**
 * The Class StudentServiceImpl.
 */
@Repository
public class StudentServiceImpl implements StudentService {

	/** The student dao. */
	@Autowired
	private StudentDao studentDao;

	/**
	 * Find all user.
	 *
	 * @return the list
	 */
	@Override
	public List<Student> findAllUser() {
		List<Student> userList = studentDao.findAllUser();
		return userList;
	}
}
