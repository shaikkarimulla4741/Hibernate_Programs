package queries.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manyTomany.mapping.Emp;

public class HQLQueries {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
//    	Student student = (Student)session.get(Student.class, 2);
//    	System.out.println(student);

//    	Fetching the Data from the Data from Data Base using the HQL.
//    	Creating a query.
		String str1 = "from Emp";

//    	We can also use the clauses like "Where".
		String str2 = "from Emp where EmpID = 4741";

//    	We can also use the place holders using a variable for the actual value.
		String str3 = "from Emp Where EmpID =: x";
		
//		We can also use the alias for Entity name.
		String str4 = "from Emp as e where e.EmpID=:x";

//    	And we need to set that x value either from taking the input from the user or by default.
//		We use the Query class object to set the values by calling a setter method. 

//    	Using the Query class to use the query
		Query<Emp> query = session.createQuery(str3);
		
//		Setting the x value.
		query.setParameter("x", 7866);

//    	Using the list to fetch the whole data from the Student Table.
		List<Emp> stdData = query.list();

//    	Using the forEach loop to traverse the data.
		for (Emp std : stdData) {
			System.out.println(std.getEmp() + " : " + std.getEmpID());
		}

		session.close();
		factory.close();
	}
	
}
