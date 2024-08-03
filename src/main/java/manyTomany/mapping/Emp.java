package manyTomany.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {

	@Id
	private int empID;
	private String emp;
	@ManyToMany
	private List<Project> projects;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empID, String emp, List<Project> projects) {
		super();
		this.empID = empID;
		this.emp = emp;
		this.projects = projects;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmp() {
		return emp;
	}

	public void setEmp(String emp) {
		this.emp = emp;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
