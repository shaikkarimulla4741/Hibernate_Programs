package oneToone.oneTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	
	public static void main(String[] args) {
		
//		Creating the Data 
		Answer a1 = new Answer();
		a1.setAnswer_ID(1);
		a1.setAnswer("Java is a Programming Language");
		
		Answer a2 = new Answer();
		a2.setAnswer_ID(2);
		a2.setAnswer("Java is a Platform Independent Language");
		
		Answer a3 = new Answer();
		a3.setAnswer_ID(3);
		a3.setAnswer("Java is a Object Oriented Language");
		
//		Storing all the answers in a List.
		List<Answer> answer=new ArrayList<>();
		answer.add(a1);
		answer.add(a2);
		answer.add(a3);
		
		Question q = new Question();
		q.setQuestion_ID(1);
		q.setQuestion("What is Java?");
		
//		Adding all the Answers to the Question
		q.setAnswers(answer);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();

//		Saving Data
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(q);
		trans.commit();
		
////		fetching
//		Question qF = (Question) session.get(Question.class, 1);
//		System.out.println(qF.getQuestion());
//		System.out.println(qF.getAnswers().getAnswers());
		
//		Question question = (Question) session.get(Question.class,1);
//		System.out.println(question.getQuestion());
//		
//		for(Answer a:question.getAnswers()) {
//			System.out.println(a.getAnswer());
//		}
		
		session.close();
		factory.close();
	}
}
