package queries.HQL;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Questions {
	@Id
	private int qId;
	private String q;
	
	@OneToMany(mappedBy="question", cascade = CascadeType.ALL)
	private List<Answers> answers;

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int qId, String q, List<Answers> answers) {
		super();
		this.qId = qId;
		this.q = q;
		this.answers = answers;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
	
}
