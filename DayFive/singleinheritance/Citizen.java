// Program to demonstrate single level inheritance with this and super keywords
package DayFive.singleinheritance;

public class Citizen {
	
	private String name;
	private String aadharno;
	private String address;
	private long phno;
	
	
	public Citizen() {
		System.out.println("Citizen object created");
	}

	public Citizen(String name, String aadharno, String address, long phno) {
		
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phno = phno;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
	

	
	
	
	
	
	
	
	
	

}