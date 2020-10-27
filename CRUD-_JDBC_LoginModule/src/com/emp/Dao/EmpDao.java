package com.emp.Dao;

import java.util.List;

import com.emp.Pojo.Employee;

public interface EmpDao {
	
	public List<Employee> Login(String email , String password);
	public List getEmpList();
	

}
