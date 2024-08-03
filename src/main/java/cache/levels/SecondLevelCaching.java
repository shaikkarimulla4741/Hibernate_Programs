package cache.levels;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.Student;

public class SecondLevelCaching {

	public static void main(String[] args) {

// 		We downloaded 2 dependencies 1.<!-- https://mvnrepository.com/artifact/net.sf.ehcache/ehcache --> 2.<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-ehcache -->
//		We configured the hibernat.cfg.xml file for using the SessionFactory cache.

//		<property name="cache.use_second_level_cache">true</property>
//      <property name="cache.region.factory_class">org.hibernate.cache.ehcache.internal.EhcacheRegionFactory</property>

//		Used 2 annotations @Cacheable, @Cache(usage = CacheConcurrencyStrategy.READ_ONLY) on the Student Class Entity to use it for the Caching
		
//		Now we can use the SessionFactory Object for caching.
//		We can fetch the data and store it in the SF object and use the same data any time without hitting the table.
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Student st = s.get(Student.class, 1);
		System.out.println(st.getName());
		s.close();
		
//		Now there is no chance of using the First Level Caching since we'he closed the session.
//		But we can use fetch the same data even after the session was closed.
//		We need to create another session.
		
		Session s1 = sf.openSession();
		Student student = s1.get(Student.class,  1);
		System.out.println(student.getEmail());
		s.close();
		sf.close();
		
	}

}
