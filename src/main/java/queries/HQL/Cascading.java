package queries.HQL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Cascading {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

//		List<Answer> answers = new ArrayList();
//		answers.add(a1);
//		answers.add(a3);
//		answers.add(a2);
//		
//		Question q = new Question();
//		q.setQuestion("What is Hibernate?");
//		q.setQuestion_ID(6);
//		q.setAnswers(answers);
//
//		s.save(q);
//		tx.commit();
//		s.close();
//		factory.close();

//		Creating the Data 
		Answers a1 = new Answers();
		a1.setaId(1);
		a1.setA("Java is a Programming Language");

		Answers a2 = new Answers();
		a2.setaId(2);
		a2.setA("Java is a Platform Independent Language");

		Answers a3 = new Answers();
		a3.setaId(3);
		a3.setA("Java is a Object Oriented Language");

//		Storing all the answers in a List.
		List<Answers> answer = new ArrayList<>();
		answer.add(a1);
		answer.add(a2);
		answer.add(a3);

		Questions q = new Questions();
		q.setqId(1);
		q.setQ("What is Java?");

//		Adding all the Answers to the Question
		q.setAnswers(answer);

//		Saving Data
//		s.save(a1);
//		s.save(a2);
//		s.save(a3);

//		Since we haven't used any persist method on answers the data won't be saved to the data base until we save it using the s.save(a).
//		And it won't create any questions_answers table for storing the q and a keys, since it is bidirectional.
		
		s.save(q);
		tx.commit();
		s.close();
		factory.close();
	}
}
