
public class Employee implements Comparable<Employee>{
	private Integer uid;
	private String firstName;
	private String lastName;
	private String location;
	
	public Employee() {}

	public Employee(Integer uid, String firstName, String lastName, String location) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [uid=" + uid + ", firstName=" + firstName + ", lastName=" + lastName + ", location=" + location
				+ "]";
	}

	@Override
	public int compareTo(Employee arg0) {
//		return this.getFirstName().compareTo(arg0.getFirstName());
//		return this.getUid().compareTo(arg0.getUid());
//		return this.getUid()-arg0.getUid();
//		return arg0.getUid()-this.getUid();
		
		if(this.getLocation().equals(arg0.getLocation()))
			return arg0.getUid().compareTo(this.getUid());
		return this.getLocation().compareTo(arg0.getLocation());
	}
	
}
