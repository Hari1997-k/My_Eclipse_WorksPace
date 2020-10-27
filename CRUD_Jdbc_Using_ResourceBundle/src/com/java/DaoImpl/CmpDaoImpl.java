package com.java.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.Dao.CmpDAO;
import com.java.Pojo.Company;
import com.java.Query.Query;

import DbConnection.DbConnection;

public class CmpDaoImpl implements CmpDAO {
	PreparedStatement pst ;
	ResultSet rs = null;
	DbConnection con  = new DbConnection();
	int rowsAffected ;
	Company cmp;
	
	
	@Override
	public void creteCmpny() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The cmp Details");
		System.out.println("Enter Company Id :");
		int cid = sc.nextInt();
		System.out.println("Enter Company Name :");
		String cname = sc.next();
		System.out.println("Enter Company Type :");
		String ctype = sc.next();
		System.out.println("ENter Company ceo :");
		String ceo = sc.next();
	 try {
		 pst = con.getConnection().prepareStatement(Query.insert);
			pst.setInt(1, cid);
			pst.setString(2, cname);
			pst.setString(3, ctype);
			pst.setString(4, ceo);
		rowsAffected = pst.executeUpdate();
		if(rowsAffected >0) {
			System.out.println("1 Row Affected");
			System.out.println("Inserted Successfully");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 sc.close();

	}

	@Override
	public void deleteCmpny() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Company ID :");
		int  id = sc.nextInt();
		try {
			pst = con.getConnection().prepareStatement(Query.delete);
			pst.setInt(1 , id );
			rowsAffected = pst.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("1 Row Affected");
				System.out.println("1 Record Deleted Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		

	}

	@Override
	public void updateCmpny () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Id :");
		int cid = sc.nextInt();
		System.out.println("Enter Company Name :");
		String cname = sc.next();
		System.out.println("Enter Company Type :");
		String ctype = sc.next();
		System.out.println("ENter Company ceo :");
		String ceo = sc.next();
		try {
			pst = con.getConnection().prepareStatement(Query.update);
			pst.setString(1 , cname);
			pst.setString(2 , ctype);
			pst.setString(3 , ceo);
			pst.setInt(4 , cid);
			rowsAffected = pst.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("1 Row Affected");
				System.out.println("1 Record Updated Successfully");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

	}

	@Override
	public void getCmpny () {
		try {
			pst = con.getConnection().prepareStatement(Query.list) ;
			rs = pst.executeQuery();
			System.out.println("================== COMPANY DETAILS ==================");
			System.out.println("CompanyId\tCompanyName\tCompanyType\tCompanyCEO");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void GetEmpById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Id :");
		int cid = sc.nextInt();
		try {
			
			pst = con.getConnection().prepareStatement(Query.CmpById);
			pst.setInt(1 , cid);
			rs = pst.executeQuery();
			System.out.println("===========================Company Details===========================");
			System.out.println("CmpID\t\tCmpName\t\tCmpType\t\t\tCmpCeo");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		
		
		
		
	}

	@Override
	public void GetCmpById_And_Name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Id :");
		int cid = sc.nextInt();
		System.out.println("Enter Company Name :");
		String cname = sc.next();
		try {
			pst = con.getConnection().prepareStatement(Query.CmpByNameAndId);
		pst.setInt(1 , cid);
		pst.setString(2, cname);
		rs = pst.executeQuery();
		System.out.println("===========================Company Details===========================");
		System.out.println("CmpID\t\tCmpName\t\tCmpType\t\t\tCmpCeo");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		
	}

	@Override
	public void limit(int start, int end) {
		try {
			pst = con.getConnection().prepareStatement("select * from Company limit "+start+","+end);
			rs = pst.executeQuery();
			System.out.println("===========================Company Details Using LIMIT ===========================");
			System.out.println("CmpID\t\tCmpName\t\tCmpType\t\t\tCmpCeo");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
