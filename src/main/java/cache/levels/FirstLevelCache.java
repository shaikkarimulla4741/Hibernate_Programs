package cache.levels;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

//		Running the first query
		Student student = session.get(Student.class, 1);
		System.out.println(student.getName());
		
//		 The get() fetches the data from the DB and stores it in the session.
//		 The data is retrieved and stored in session object.
//		 If we call the same data the query doesn't hit the DB.
//		 It returns the data the from the session object.

		System.out.println("Doing some work");

//		 Again retrieving the same data.
		Student student1 = session.get(Student.class, 1);
		System.out.println(student1.getName());

//		 The query runs only once but we get the data twice since the we've called the data before closing the session
		session.close();
		factory.close();

	}

}
