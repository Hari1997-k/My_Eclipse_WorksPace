package Com.spring.RowmapperDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		StudentDAO sd = (StudentDAO) context.getBean("sdao");
		//FOR INSERTING STUDENT :
		
		/*
		 * Student st = new Student(); st.setSid(3); st.setSname("ABCD");
		 * st.setSbranch("SSC"); sd.insertStudent(st);
		 */
		
		//FOR GETTING ALL STUDENTS using  entity using query  :		
		/*List<Student> sts = sd.getStudents(st);
		System.out.println("Sid :\t\t" + "SName :\t\t" + "SBranch :\t\t");
		for (Student sl : sts) {
			System.out.println(sl.getSid() + "\t\t" + sl.getSname() + "\t\t" + sl.getSbranch());
		}*/
		 
		
		//getting all students using sid  from table using quer of object:
		//System.out.println(sd.getAllBysid(3000).getSname());
		//getting all students using sname  from table:
		//System.out.println(sd.GetAllStudentsBySname("Hari_K").getSbranch());
		
//System.out.println(sd.getSTD("Hari_K"));
		
		/*
		 * List<Student> slist = sd.getSTD(); for (Student sdd : slist) {
		 * System.out.println(sdd.getSbranch() + "\t\t" + sdd.getSid() + "\t\t" +
		 * sdd.getSname()); }
		 */

		//System.out.println(sd.getStudents().get);
		/*
		 * Student stde = new Student(); stde.setSid(1233); stde.setSbranch("ad");
		 * stde.setSname("lkop"); List<Student> lst = sd.getStudents(stde); for(Student
		 * dd : lst) {
		 * System.out.println(dd.getSid()+"\t\t"+dd.getSname()+"\t\t"+dd.getSname()); }
		 * 
		 */
		//System.out.println(sd.getsBranch("Hari").getSname());
		
	}
}
