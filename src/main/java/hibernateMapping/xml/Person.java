package hibernateMapping.xml;

public class Person {

	private int iD;
	private String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int iD, String name) {
		super();
		this.iD = iD;
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
