package com.dejan.student.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//model class
@Entity // mapping to db studenttab
@Table(name = "studenttab") // different name of the table name in data base
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // id is auto_increment in db
	private long id;
	@Column(name = "sname") // name in db is 'sname'
	private String name;
	@Column(name = "scourse")
	private String course;
	@Column(name = "sfee")
	private Double fee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}

}
