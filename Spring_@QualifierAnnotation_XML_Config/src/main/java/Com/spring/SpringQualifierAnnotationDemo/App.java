package Com.spring.SpringQualifierAnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	//FOR XML CONFIGUTRATION :
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);			
	}
}
	