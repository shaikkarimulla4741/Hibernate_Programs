package hibernate.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
	private int answer_ID;
	private String answer;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Answer(int answer_ID, String answer) {
		super();
		this.answer_ID = answer_ID;
		this.answer = answer;
	}
	
	public int getAnswer_ID() {
		return answer_ID;
	}
	public void setAnswer_ID(int answer_ID) {
		this.answer_ID = answer_ID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
