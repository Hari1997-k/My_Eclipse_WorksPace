package Com.spring.SpringMapSinj;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	//FOR XML BASED SETTER INJECTION  WITH MAP:
	/*public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		Question quest =  (Question) context.getBean("que");
		System.out.println("Question is  :  "+ quest.getQues());
		Map<String , String> mp = quest.getAnswer();
		for(Map.Entry<String , String> mpp : mp.entrySet()) {
			System.out.println("Author is : "+ mpp.getKey()+"\t"+ "Answer is :"+ mpp.getValue());
		}
}*/
	//FOR SETTER INJECT WITH List USING ANNOTATAION CONFIG:
	/*public static void main(String[] args) {

	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
	Question que = context.getBean(Question.class);
	System.out.println("Question Is :\n"+que.getQues());
	System.out.println("Answers Are :\n"+que.getAnswer().toString().replace("[", "")+"\t");
	}*/
	
	
	//FOR ANNOTATION BASED SETTER INJECTION WITH MAP INTERFACE :
	/*public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Question ques = context.getBean(Question.class);
	System.out.println("Question is \n"+ques.getQues());
	System.out.println("Answers Are :\n"+"Author :"+ques.getAnswer().toString().replace(",", "\n"));
}*/
}
