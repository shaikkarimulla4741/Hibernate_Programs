package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentID;
	private String name;
	private String email;
	private Certificate certificate;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentID, String name, String email, Certificate certificate) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.email = email;
		this.certificate = certificate;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
