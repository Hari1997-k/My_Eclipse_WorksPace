package Com.spring.SpringMapCinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
//CONSTRUCTOR INJECTION WITH MAP INTERFAVE USING XML :
    /*public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml")  ;
    	Question quest = (Question) context.getBean("que");
    	quest.show();

    }*/
	
//CONSTRUCTOR INJECT WITH MAP INTERFAVE USING ANNOTATION  :

	/* public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Question que = context.getBean(Question.class);
		que.show();
	}*/
	
//ANNOTATION CONFIGURATION USING CONSTRUCTOR INJECTION WITH LIST:
	/*public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Question que = context.getBean(Question.class);
	que.show();
}*/
	//ANNOTATION CONFIGURATION USING CONSTRUCTOR INJECTION WITH LIST & MAP :

	/*public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Question que  = context.getBean(Question.class);
		que.show();
	}*/
}