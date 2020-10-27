package Com.spring.SpringCollectionsCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
    	Question quest = (Question) context.getBean("que");
    	quest.show();
    	
    	
    	
    }
    
}
