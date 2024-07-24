package hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int addressID;

	@Column(name = "student_city")
	private String city;

	@Column(length = 10)
	private String street;

	@Lob
	private byte studentImg[];

	@Temporal(TemporalType.DATE)
	private Date addedDate;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressID, String city, String street, byte[] studentImg, Date addedDate) {
		super();
		this.addressID = addressID;
		this.city = city;
		this.street = street;
		this.studentImg = studentImg;
		this.addedDate = addedDate;
	}

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public byte[] getStudentImg() {
		return studentImg;
	}

	public void setStudentImg(byte[] studentImg) {
		this.studentImg = studentImg;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

}
