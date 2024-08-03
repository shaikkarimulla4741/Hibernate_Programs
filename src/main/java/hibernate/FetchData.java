package hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manyTomany.mapping.Emp;

public class FetchData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
    	Student student = (Student)session.get(Student.class, 2);
    	System.out.println(student);
		session.close();
		factory.close();

	}

}
