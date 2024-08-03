package oneToone.oneTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int question_ID;
	private String question;
	
//	@OneToOne This used to perform OneToOne Mapping 1 row to 1 row
	
	@OneToMany//  This is for 1 row to many rows
	private List<Answer> answers;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(int question_ID, String question, List<Answer> answers) {
		super();
		this.question_ID = question_ID;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestion_ID() {
		return question_ID;
	}
	public void setQuestion_ID(int question_ID) {
		this.question_ID = question_ID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
