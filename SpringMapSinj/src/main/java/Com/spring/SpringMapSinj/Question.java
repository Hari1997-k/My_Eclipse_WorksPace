package Com.spring.SpringMapSinj;

import java.util.Map;

public class Question {
	private String ques ;
	//private List<String> answer;	
	private Map<String , String> answer;
	public Question() {
		
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public Map<String, String> getAnswer() {
		return answer;
	}

	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	

	/*
	 * public List<String> getAnswer() {
	 *  return answer; }
	 * 
	 * public void setAnswer(List<String> answer) { 
	 * this.answer = answer; }
	 */
	

}
