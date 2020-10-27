package com.java.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.Connection.DbConnection;
import com.java.Dao.StdDao;
import com.java.pojo.Student;

public class StdDaoImpl implements StdDao {
	DbConnection con = new DbConnection();
	PreparedStatement pst = null;
	int rowsAffected =0 ;
	ResultSet rs;
	
	

	@Override
	public void CreateStudent(Student st) {  
		try {
			pst = con.getConnection().prepareStatement("insert into Student values (?,?,?,?)");
			pst.setInt	(1 , st.getSid());
			pst.setString(2 , st.getSname());
			pst.setString(3 , st.getSbranch());
			pst.setString(4 , st.getSaddress());
			rowsAffected = pst.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("1 row Affected");
				System.out.println("1 Record Inserted Succesfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public List<Student> getSTudents() {
		//System.out.println("Im Called");
		 List<Student> slst = new ArrayList<Student>();

		try {
			pst = con.getConnection().prepareStatement("select * from Student ");
			 rs = pst.executeQuery();
			 while(rs.next()) {
				 Student std  = new Student();

				 std.setSid(rs.getInt("sid"));
				 std.setSname(rs.getString("sname"));
				 std.setSbranch(rs.getString("sbranch"));
				 std.setSaddress(rs.getString("saddress"));
				 slst.add(std);
							 }
			 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slst;
	}


	@Override
	public void DeleteStd(int id) {
		try {
			pst = con.getConnection().prepareStatement("delete from student where sid = ?");
			pst.setInt(1 , id);
			rowsAffected = pst.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("1 Row Affected");
				System.out.println("1 record deleted Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Student getStdById(int id) {
		//System.out.println("Hi my name is getById");
		Student std = null ;
		try {
			pst = con.getConnection().prepareStatement("select * from Student where sid = ?");
			pst.setInt(1 ,  id);
			rs = pst.executeQuery();

			while(rs.next()) {
				std = new Student();
				std.setSaddress(rs.getString(4));
				std.setSbranch(rs.getString(3));
				std.setSname(rs.getString(2));
				std.setSid(rs.getInt(1));
				System.out.println(std.getSid());
				//System.out.println("My Details :"+std.getSaddress()+"\t\t"+std.getSbranch()+"\t\t"+std.getSname()+"\t\t"+std.getSid());

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return std;
	}


	@Override
	public void Update(Student st) {
		try {
			pst = con.getConnection().prepareStatement("update Student set  sname = ? , sbranch = ? , saddress = ? where sid = ?");
			pst.setInt(4, st.getSid());
			pst.setString(1 , st.getSname());
			pst.setString(2 , st.getSbranch());
			pst.setString(3 , st.getSaddress());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public List<Student> pagination(int start , int end) {
		
		System.out.println("HEY WASSUPP DUDE");
		ArrayList<Student> alst = new ArrayList<Student>();

		try {
			pst = con.getConnection().prepareStatement("select * from Student limit "+start+","+end);
			rs =pst.executeQuery();
			while(rs.next()) {
				Student std = new Student();

				 std.setSid(rs.getInt("sid"));
				 std.setSname(rs.getString("sname"));
				 std.setSbranch(rs.getString("sbranch"));
				 std.setSaddress(rs.getString("saddress"));
				 alst.add(std);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alst;
	}

}
