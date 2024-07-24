package hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args ) throws IOException
    {
    	
    	Student studentData = new Student();
    	studentData.setEmail("shaik@gmail.com");
    	studentData.setName("Bhai");
    	studentData.setStudentID(2);
//    
    	Address studentAddress = new Address();
    	studentAddress.setAddressID(1);
    	studentAddress.setCity("Damuluru");
    	studentAddress.setStreet("Last Bazar");
    	studentAddress.setAddedDate(new Date());
//    	
//    	Reading Image File
    	
    	FileInputStream fileInputStream = new  FileInputStream("src/main/java/8f69ebd9-475a-46b4-9b59-0d2f04b472b4.jpg");
    	byte[] data = new byte[fileInputStream.available()];
    	fileInputStream.read(data);
    	
//    	studentAddress.setStudentImg(data);
    	
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory(); 
    	Session session = factory.openSession();
    	Transaction tcn = session.beginTransaction();
    	session.save(studentData);
    	session.save(studentAddress);
    	tcn.commit();
    	session.close();  
    }
}
