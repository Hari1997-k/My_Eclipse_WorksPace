package Com.spring.SpringAutowireUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	//ANNOTATION CONFIG FOR AUTOWIRE BY PROEPRTY  :
    /*public static void main( String[] args )
    {
    	ApplicationContext   context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee empl = context.getBean(Employee.class);
    	System.out.println(empl);
	}*/
	//ANNOTATION CONFIG FOR AUTOWIRE BY SETTER  :
    /*public static void main( String[] args )
    {
    	ApplicationContext   context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee emp = context.getBean(Employee.class);
    	System.out.println(emp);
}
}*/
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = context.getBean(Employee.class);
System.out.println(emp.getAddress().getCity());		
	}
}
