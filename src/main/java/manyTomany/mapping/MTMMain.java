package manyTomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MTMMain {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory  factory =  cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Emp emp1 = new Emp();
		emp1.setEmpID(4741);
		emp1.setEmp("Karimulla");
		
		Emp emp2 = new Emp();
		emp2.setEmpID(7866);
		emp2.setEmp("Bhai");
		
		Project pro1 = new Project();
		pro1.setProID(1);
		pro1.setPro("E-Commerce Site");
		
		Project pro2 = new Project();
		pro2.setProID(2);
		pro2.setPro("Student Registration");
		
		List<Project> proList = new  ArrayList<>();
		proList.add(pro1);
		proList.add(pro2);
		
		List<Emp> empList = new ArrayList<>();
		empList.add(emp2);
		
		emp1.setProjects(proList);
		
		pro2.setEmps(empList);
		
		session.save(emp1);
		session.save(emp2);
		session.save(pro1);
		session.save(pro2);
		
		tx.commit();

		
	}

}
