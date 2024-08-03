package queries.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import oneToone.oneTomany.Question;

public class HQLPagination {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Query query = s.createQuery("from Question");
		
//		Setting the start point from which row to fetch. 
		query.setFirstResult(0);
		
//		Setting the end point, where to stop the fetching.
		query.setMaxResults(5);
		
		List<Question> q = query.list();
		
		for(Question question: q) {
			System.out.println(question.getQuestion_ID()+" : "+question.getQuestion());
		}
		
		s.close();
		factory.close();
		
	}

}
