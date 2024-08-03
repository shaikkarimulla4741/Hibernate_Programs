package queries.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class SQLQuery {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();

//		Creating a SQL query.
		String sql = "select * from Question";

//		Implementing the query using the createSQLQuery and NativeQuery Interface.
		Query nQ = s.createSQLQuery(sql);

//		Since it is a NativeQuery it represents a Table in Data Base not a Class which is an Object.
		List<Object[]> data = nQ.list();
		
		for(Object[] obj: data) {
			System.out.println(obj[0]+":"+obj[1]);
		}

		s.close();
		factory.close();

	}

}
