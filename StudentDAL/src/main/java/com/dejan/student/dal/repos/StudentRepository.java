package com.dejan.student.dal.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.dejan.student.dal.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
