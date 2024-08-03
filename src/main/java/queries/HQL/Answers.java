package queries.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
    @Id
    private int aId;
    private String a;
    
    @ManyToOne
    private Questions question;

    public Answers() {
        super();
    }

    public Answers(int aId, String a, Questions question) {
        super();
        this.aId = aId;
        this.a = a;
        this.question = question;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }
}
