package com.emp.Utility;

import java.util.List;
import java.util.Scanner;

import com.emp.DaoImpl.EmpDaoImpl;
import com.emp.Pojo.Employee;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("============================**WELCOME TO EMPLOYEE LOGIN FORM**=========================");

		String op = "";
		boolean admin = false ;
		do {
			System.out.println("1) Loin As Employee\n2)Login As Admin\n3)View My Details\n4)View All EMployee Details");
			System.out.println("Enter Your Choice ");
			char ch = sc.next().charAt(0);

			System.out.println("Enter The Email :");
			String email = sc.next();
			System.out.println("Enter The Password :");
			String pass = sc.next();
			List<Employee> alist = null;
			EmpDaoImpl impl = new EmpDaoImpl();

			switch (ch) {
			case '1':

				alist = impl.Login(email, pass);

				if (alist.size() != 0) {
					System.out.println(email + "  Logged In Successfully");
				} else {
					System.out.println(" SORRY!!!!-lOGGIN FAILED");
				}
				break;
			case '2':

				if (email.equals("Admin@Gmail.com") && pass.equals("Admin")) {
					admin = true ;
					System.out.println("Access Changed To Administrator");
				} else {
					System.out.println("Authentication Failed Wrong Admin Details");
				}
				break;
			case '3':
				alist = impl.Login(email, pass);
				System.out.println(
						"=================================**Employee Details**================================= ");
				for (Employee ee : alist) {
					System.out.println(ee.getEid() + "\t" + ee.getEname() + "\t" + ee.getEmail() + "\t" + ee.getErole()
							+ "\t" + ee.getPassword() + "\t" + ee.getJdate() + "\t" + ee.getRdate());

				}
				break;

			case '4':
				if (admin) {
					List<Employee> blist = impl.getEmpList();
					System.out.println("ENTIRE EMPLOYEE LIST : ");
					for (Employee ee : blist) {
						System.out.println(
								ee.getEid() + "\t" + ee.getEname() + "\t" + ee.getEmail() + "\t" + ee.getErole() + "\t"
										+ ee.getPassword() + "\t" + ee.getJdate() + "\t" + ee.getRdate());
					}

				}
				break;
			}
			System.out.println("Do You Want To Continue Yes/No");
			op = sc.next();
			if (!(op.equals("Yes") || op.equals("No"))) {
				System.out.println("Wrong Selection Say Yes(OR)No");
				op = sc.next();
			}
		}

		while (op.equals("Yes"));
		
		System.out.println("ThankYou");
	}

}
