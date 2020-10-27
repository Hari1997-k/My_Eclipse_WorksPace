package com.spring.SpringCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class Question {
	//FOR SETTER INJECTION :
	private String ques ;
	private List<String> answers;
	private Set<Integer> Rank;
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set<Integer> getRank() {
		return Rank;
	}
	public void setRank(Set<Integer> rank) {
		Rank = rank;
	}
	
	
	
	
}
