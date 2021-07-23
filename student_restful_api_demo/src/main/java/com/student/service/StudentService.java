package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {

	public Student createStudent(Student student);
	public Student getStudentById(int id);
	public Student updateStudent(Student student);
	public void deleteStudent(int id);
	
	public List<Student> getAllStudents();
	public List<Student> getStudentsByName(String name);
	public List<Student> getStudentsByAge(int age);
	public List<Student> getStudentsByCity(String city);
	public List<Student> getStudentsByGender(String gender);
}
