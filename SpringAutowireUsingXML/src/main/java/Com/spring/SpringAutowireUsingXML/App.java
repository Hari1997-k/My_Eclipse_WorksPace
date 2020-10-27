package Com.spring.SpringAutowireUsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
    	Employee emp = (Employee) context.getBean("emp");
    	System.out.println("Employee Details :\n"+"eid=" + emp.getEid() + " ename=" + emp.getEname());
    	System.out.println(emp.getAddress().getCity());
    	System.out.println("Emp Address Details :\n" + "doorno="+emp.getAddress().getDoorno() + ", street=" + emp.getAddress().getStreet() + ", City=" + emp.getAddress().getCity());
    }
}
