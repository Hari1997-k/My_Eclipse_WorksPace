package OOPS_Concept_Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Employee Details : ");
		System.out.println("==================================");

		System.out.println("Enter The Employee Id  :");
		int eid = sc.nextInt();

		System.out.println("Enter The EMployee Name : ");
		String ename = sc.next();

		System.out.println("Enter The Employee CompanyName  ");
		String cname = sc.next();

		System.out.println("Enter The Company Type : ");
		String ctype = sc.next();
		//sc.next();

		System.out.println("Enter The Company Rank : ");
		String rank = sc.next();
		//sc.next();

		System.out.println("Enter The Empoyee State : ");
		String state = sc.next();

		System.out.println("Enter The Employee City : ");
		String city = sc.next();

		System.out.println("Enter The Zip : ");
		int zip = sc.nextInt();

		System.out.println("Enter The Country : ");
		String country = sc.next();

		Company cmp = new Company();
		cmp.setCname(cname);
		cmp.setCrank(rank);
		cmp.setCtype(ctype);

		Address add = new Address();
		add.setCity(city);
		add.setState(state);
		add.setZip(zip);
		add.setCountry(country);

		Employee emp = new Employee();
		emp.setEname(ename);
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setEaddress(add);
		emp.setEcompany(cmp);

		System.out.println("===========================================================");
		System.out.println("The Employee Details Are : ");
		System.out.println(emp.toString().replace("[", "").replace("]", ""));

		sc.close();

	}
}
