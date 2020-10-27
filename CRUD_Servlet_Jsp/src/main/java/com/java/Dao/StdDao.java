package com.java.Dao;

import java.util.List;

import com.java.pojo.Student;

public interface StdDao {
	public void CreateStudent(Student st);
	public List<Student> getSTudents();
	public void DeleteStd(int id);
	public Student getStdById(int id);
	public void Update(Student st);
	List<Student> pagination(int start , int end);

}
