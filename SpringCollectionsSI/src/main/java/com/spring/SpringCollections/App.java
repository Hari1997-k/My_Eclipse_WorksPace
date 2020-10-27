package com.spring.SpringCollections;

import java.util.List;
import java.util.Set;

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
    	//SETTER INJECTION WITH COLLECTION OBJECTS :
        ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
        Question ques = (Question) context.getBean("que");
        List<String> answers = ques.getAnswers();
        //USING LIST
        System.out.println("Question is :\n"+ques.getQues());
    	System.out.println("\nAnswers Are :");
    	for(String ans : answers) {
        	System.out.println(ans);
        }
    	//USING SET :
    	System.out.println("\nRanks For Answers :");
    	Set<Integer> rank = ques.getRank();
    	for(Integer rnk : rank) {
    		System.out.println(rnk);
    	}
        
        
    }
}
