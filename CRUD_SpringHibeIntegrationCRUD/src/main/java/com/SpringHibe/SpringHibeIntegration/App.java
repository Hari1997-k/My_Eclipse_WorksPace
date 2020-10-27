package com.SpringHibe.SpringHibeIntegration;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   	ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
    	EmpDAO ed = (EmpDAO) context.getBean("edao");
    	
    	Employee emp = new Employee();
		  //emp.setEid(20);
		  emp.setEname("ROWAN RAO");
		  emp.setErole("Model");
		  //ed.createEmployee(emp);
		 
    	//ed.deleteEmployee(1);
    	//ed.updateEmployee("Rahul");
		/*
		 * List<Employee> ep = ed.getEmployee();
		 * System.out.println("Eid\t\t"+"Ename\t\t"+"erole"); for(Employee epp : ep) {
		 * System.out.println(epp.getEid()+"\t\t"+epp.getEname()+"\t\t"+epp.getErole());
		 * }
		 
			System.out.println("Eid\t\t"+"Ename\t\t"+"erole"); 
			List<Employee> elst1 = ed.getEmployeeById(2);
		    for(Employee ee : elst1) {
			  System.out.println(ee.getEid()+"\t\t"+ee.getEname()+"\t\t"+ee.getErole());
		  }
    	//ed.updatEmpByName("RamaRao");
		 List<Employee> ee = ed.getEmpByName("SubbaRao");
		 for(Employee e : ee) {
			 System.out.println("Eid\t\t"+"Ename\t\t"+"\tErole");
			 System.out.println(e.getEid()+"\t\t"+ e.getEname()+"\t\t"+e.getErole());
		 }*/
		  List<Employee> ee = ed.getEmpById(9);
			 for(Employee e : ee) {
				 System.out.println("Eid\t\t"+"Ename\t\t"+"\tErole");
				 System.out.println(e.getEid()+"\t\t"+ e.getEname()+"\t\t"+e.getErole());
		
    }
}
}