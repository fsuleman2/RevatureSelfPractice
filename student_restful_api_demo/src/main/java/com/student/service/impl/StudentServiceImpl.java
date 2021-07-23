package com.student.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.student.model.Student;
import com.student.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private static Map<Integer,Student> students=new HashMap<>();
	private static int count=0;
	
	@Override
	public Student createStudent(Student student) {
		student.setId(++count);
		students.put(student.getId(), student);
		return student;
	}

	@Override 
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return students.get(id);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.put(student.getId(), student);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		students.remove(id);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return new ArrayList<>(students.values());
	}

	@Override
	public List<Student> getStudentsByName(String name) {
		
		return students.values().stream().filter(x->x.getName().equals(name)).collect(Collectors.toList());
	}

	@Override
	public List<Student> getStudentsByAge(int age) {
		// TODO Auto-generated method stub
		return students.values().stream().filter(x->x.getAge()==age).collect(Collectors.toList());
	}

	@Override
	public List<Student> getStudentsByCity(String city) {
		// TODO Auto-generated method stub
		return students.values().stream().filter(x->x.getCity().equals(city)).collect(Collectors.toList());
	}

	@Override
	public List<Student> getStudentsByGender(String gender) {
		// TODO Auto-generated method stub
		return students.values().stream().filter(x->x.getGender().equals(gender)).collect(Collectors.toList());
	}

}
