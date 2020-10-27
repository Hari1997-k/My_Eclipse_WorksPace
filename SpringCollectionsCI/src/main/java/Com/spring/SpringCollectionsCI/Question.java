package Com.spring.SpringCollectionsCI;

import java.util.List;

public class Question {
	private String ques;
	private List<String> answer;

	public Question() {

	}

	public Question(String ques, List<String> answer) {
		super();
		this.ques = ques;
		this.answer = answer;
	}

	public void show() {
		System.out.println("Question  : ques=" + ques);

		for (String str : answer) {
			System.out.println("Answers :" + str);

		}
	}

}
