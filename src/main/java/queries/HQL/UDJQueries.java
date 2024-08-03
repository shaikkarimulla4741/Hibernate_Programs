package queries.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UDJQueries {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//		Creating a Query for Delete.
		String del = "delete from Question where question_ID=:id";

//		Creating a Query for Update.
		String upd = "update Question set question=:q where question_ID=:id";

//		Creating a Query to fetch the Question and its Answers using the Join.
		String joi = "select q.question, q.question_ID, a.answer from Question as q INNER JOIN q.answers as a";

//		This Query class is used from or.hibernate which is deprecated.
		Query q = session.createQuery(joi);
//		q.setParameter("q", "What do you know about Java?");
//		q.setParameter("id", 1);

//		It returns the no.of items were deleted.
//		q.executeUpdate();

		tx.commit();

//		Since we are fetching data from multiple objects we used the Objec[] to store the data, and used Arrays.toString() to print the data.
		List<Object[]> qAndA = q.getResultList();

		for (Object[] data : qAndA) {
			System.out.println(Arrays.toString(data));
		}

		session.close();
		factory.close();

	}

}
