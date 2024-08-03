package manyTomany.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int proID;
	private String pro;
	
	@ManyToMany 
	private List<Emp> emps;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int proID, String pro, List<Emp> emps) {
		super();
		this.proID = proID;
		this.pro = pro;
		this.emps = emps;
	}

	public int getProID() {
		return proID;
	}

	public void setProID(int proID) {
		this.proID = proID;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
}
