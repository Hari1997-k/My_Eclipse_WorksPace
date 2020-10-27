package Com.Spring.SpringUsingXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {	
 //SETTER INJECTION USING ANNOTATION :
 //===================================
    	/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee e = context.getBean(Employee.class);
    	System.out.println("Annotation Base Setter Injection :");
    	System.out.println("Emoloyes Details:\t"+e.getEid()+"\t"+e.getEname()+"\t"+e.getErole());
    	System.out.println("Amployee Address Are : \t"+e.getAddress().getDistrict()+"\t"+e.getAddress().getDoorNo()+"\t"+e.getAddress().getStreet());*/
 
//Constructor INJECTION USING ANNOTATION :
//===================================    	
    	/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee emp = context.getBean(Employee.class);
    	emp.show();*/
    	
    }
}
