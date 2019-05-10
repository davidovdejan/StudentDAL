package com.dejan.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.dejan.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
