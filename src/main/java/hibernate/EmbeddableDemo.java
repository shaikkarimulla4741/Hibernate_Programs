package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Hibernate");
		certificate.setDuration("1 month");
		
		Student student = new Student();
		student.setStudentID(4741);
		student.setName("Karimulla");
		student.setEmail("shaikkarimulla4741@gmail.com");
		student.setCertificate(certificate);
		session.save(student);
		trans.commit();
		session.close();
		
	}

}
