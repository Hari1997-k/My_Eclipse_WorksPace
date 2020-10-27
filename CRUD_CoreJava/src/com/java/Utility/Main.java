package com.java.Utility;

import java.util.Scanner;

import com.java.EmpDAO.EmpDAO;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	EmpDAO edao = new EmpDAO();
	
	System.out.println("Welcome TO CoreJava CRUD Operations :");
	System.out.println(" select Your Options :");
	System.out.println(" 1) Insert \n 2) DeleteEmployeeById\n 3) GetAllEmployees\n 4) UpdateEmployeeById\n 5) GetEmployeeById ");
	System.out.println("\n Enter Ur Choice :");
	char choice = sc.next().charAt(0);
	
	switch(choice) {
	case '1':
	edao.creteEmployee();
	break;
	case '2':
	edao.deleteEmp();
	break;
	case '3':
	edao.EmpList();
	break;
	case '4':
	edao.UpdateEmp();
	break;
	case '5':
	edao.GetEmpById();
	break;
	default:
		System.out.println("ntg");
	
	}
	sc.close();
}
}