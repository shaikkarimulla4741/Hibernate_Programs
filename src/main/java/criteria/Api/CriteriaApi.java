package criteria.Api;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import hibernate.Student;

public class CriteriaApi {

	public static void main(String[] args) {
		
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Criteria c = s.createCriteria(Student.class);
		
//		We've various methods to filter the data.
//		like, gt, lt, eq etc., and so many.
		c.add(Restrictions.eq("studentID", 1));
		List<Student> data = c.list();
		
		for(Student std: data) {
			System.out.println(std.getName());
		}
	}

}
