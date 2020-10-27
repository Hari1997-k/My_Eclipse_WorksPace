package Com.spring.SpringMapCinj;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Question {
	private String ques;
	private List<String> Author;
	private Map<String , String> answer;
	List<String> str;
	public Question() {
		
	}
	public Question(String ques, List<String> Author, Map<String, String> answer) {
		super();
		this.ques = ques;
		this.Author = Author;
		this.answer = answer;
	}
	//FOR BOTH LIST & MAP :
	/*public void show() {
		System.out.println("Question is :"+ ques);
		//for Author :
		List<String> alst = Author;
		for(String str :alst) {
		System.out.println("Author Of Question :"+str);
		}
		//for Answer:
		Map<String , String> mp = answer;
		for(Entry<String, String> mpp :mp.entrySet()) {
			System.out.println("QLevel is :"+ mpp.getKey());
			System.out.println("Answer is :"+ mpp.getValue());
		}
		}*/
	
	//ANOTHER WAY FOR LIST & MAP :
	/*public void show() {
		System.out.println("Question is :" + ques);
		List<String> alst = Author;
		for (String str : alst) {
			Map<String, String> mp = answer;
			for (Entry<String, String> mpp : mp.entrySet()) {
				System.out.println("Author Of Question :" + str + "\tQLevel is :" + mpp.getKey() + "\t" + "Answer is :"
						+ mpp.getValue());
			}
		}
	}*/

	//FOR LIST :
	/*public Question(String ques, List<String> answer) {
		super();
		this.ques = ques;
		this.answer = answer;
	}
	  public void show() {
		System.out.println("Question is "+ ques);
		List<String> lst = answer;
		for(String  ans :lst) {
			System.out.println("answer is :"+ ans);
		}
	}*/
	
	//FOR MAP:
		/*
	public Question(String ques, Map<String, String> answer) {
		super();
		this.ques = ques;
		this.answer = answer;
	}
	public void show() {
		System.out.println("Question is :"+ ques);
		Map<String , String> mp = answer;
		for(Map.Entry<String , String> mpp : mp.entrySet()) {
			System.out.println("Author is : "+ mpp.getKey());
			System.out.println("Answer is :"+ mpp.getValue());
		}*/
		
	}
	
	

