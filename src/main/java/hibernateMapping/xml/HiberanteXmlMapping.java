package hibernateMapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberanteXmlMapping {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
		
		Person  p = new Person(4741,"Karimulla");
		s.save(p);
		
		ts.commit();
		s.close();
		sf.close();
	}

}
