package com.example.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.dao.StudentDao;
import com.example.entity.Student;

@Transactional(rollbackOn = Exception.class)
@Repository
public class StudentDaoImpl implements StudentDao{
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public List<Student> findAllUser() {
		return entityManager.createQuery("SELECT st.id, st.username, st.password, st.status FROM Student st", Student.class).getResultList();
	}
}
