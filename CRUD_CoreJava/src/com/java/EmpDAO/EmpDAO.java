package com.java.EmpDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.java.pojo.Employee;

public class EmpDAO {
	static String url = "jdbc:mysql://localhost:3306/JavaCrud";
	static String user = "root";
	static String password = "";

	public void creteEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Employee Details :");
		System.out.println("Enter EmpID :");
		int id = sc.nextInt();

		System.out.println("Enter EmpName :");
		String Ename = sc.next();
		System.out.println("Enter Designation");
		String Edsg = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, Ename);
			pst.setString(3, Edsg);
			int rowsEffected = pst.executeUpdate();
			System.out.println("1 row Affected : " + rowsEffected);
			if (rowsEffected > 0) {
				System.out.println("Data Inserted Successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		sc.close();
	   }
	}

	public void deleteEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Employee Details :");
		System.out.println("Enter EmpID :");
		int id = sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pst = con.prepareStatement("delete from employee where eid = ?");
			pst.setInt(1, id);
			int RowsEffected = pst.executeUpdate();
			if (RowsEffected > 0) {
				System.out.println("1 Row Affected");
				System.out.println("1 record Deleted Successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
		   }
	}

	public void UpdateEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Employee Details :");
		System.out.println("Enter EmpID :");
		int id = sc.nextInt();

		System.out.println("Enter EmpName :");
		String Ename = sc.next();
		System.out.println("Enter Designation");
		String Edsg = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pst = con
					.prepareStatement("update employee set ename = ? , edesignation = ? where eid = ?");
			pst.setString(1, Ename);
			pst.setString(2, Edsg);
			pst.setInt(3, id);
			int RowsEffected = pst.executeUpdate();
			if (RowsEffected > 0) {
				System.out.println("1 Row Affected");
				System.out.println("1 record Updated Successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
		   }
	}

	public void EmpList() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pst = con.prepareStatement("select * from Employee");
			ResultSet rs = pst.executeQuery();
			System.out.println("\t\tEmployee List \n");
			System.out.println("EmpId\t\tEmpName\t\tEmpDesignation");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void GetEmpById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Employee Details :");
		System.out.println("Enter EmpID :");
		int id = sc.nextInt();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pst = con.prepareStatement("select * from Employee where eid = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("EmpId\t\tEmpName\t\tEmpDesignation");
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
		   }

	}

}