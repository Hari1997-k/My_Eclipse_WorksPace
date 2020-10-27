 package com.emp.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.Dao.EmpDao;
import com.emp.DbConnection.DbConnection;
import com.emp.Pojo.Employee;

public class EmpDaoImpl implements EmpDao {
	Connection con  = null ;
	DbConnection db = new DbConnection();
	PreparedStatement pst=  null ;
	ArrayList<Employee> emplist ;
	ArrayList<Employee> emplist1 ;

	Employee emp ;
	
	@Override
	public List<Employee> Login(String email, String password) {
		
		
		con = db.getConnection();
		 try {
			pst = con.prepareStatement("select * from employee where empmail =? and password = ?");
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				emplist = new ArrayList<Employee>();
				emp = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setEmail(rs.getString(4));
				emp.setEname(rs.getString(2));
				emp.setErole(rs.getString(3));
				emp.setJdate(rs.getDate(6));
				emp.setRdate(rs.getDate(7));
				emp.setPassword(rs.getString(5));
				emplist.add(emp);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;
		 
		 
		

		

	}

	@Override
	public List<Employee> getEmpList() {
		con = db.getConnection();
		emplist1 = new ArrayList<Employee> ();

		try {
			pst = con.prepareStatement("select * from employee");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setEmail(rs.getString(4));
				emp.setEname(rs.getString(2));
				emp.setErole(rs.getString(3));
				emp.setJdate(rs.getDate(6));
				emp.setRdate(rs.getDate(7));
				emp.setPassword(rs.getString(5));
				emplist1.add(emp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return emplist1;
	}

}
