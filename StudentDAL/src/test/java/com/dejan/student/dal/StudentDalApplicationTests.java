package com.dejan.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dejan.student.dal.entities.Student;
import com.dejan.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {
	@Autowired
	private StudentRepository repository;

	@Test
	public void testCreateStudent() {

		Student student = new Student();
		student.setName("Dejan");
		student.setCourse("Java superklas");
		student.setFee(30d);
		repository.save(student);

	}

	@Test
	public void testFind() {
		Student student = repository.getOne(1l);
		System.out.println(student);
	}

	@Test
	public void testUpdate() {
	Student student = repository.getOne(1l);
	student.setFee(50d);
	repository.save(student);
	System.out.println(student);
	}

	@Test
	public void testDelete() {
		Student student = new Student();
		student.setId(1l);
		repository.delete(student);
	}
}
