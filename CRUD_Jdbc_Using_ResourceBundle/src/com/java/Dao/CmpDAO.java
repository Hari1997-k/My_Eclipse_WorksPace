package com.java.Dao;

import java.util.List;

import com.java.Pojo.Company;

public interface CmpDAO {
	
	public void creteCmpny();
	public void deleteCmpny();
	public void getCmpny();
	public void updateCmpny();
	public void GetEmpById();
	public void GetCmpById_And_Name();
	public void limit(int start , int end);

}
