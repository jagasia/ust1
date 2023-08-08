
public class Employee implements Comparable<Employee>
{
	private Integer id;
	private String firstName;
	private String lastName;
	private String location;
	
	public Employee() {}

	public Employee(Integer id, String firstName, String lastName, String location) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", location=" + location
				+ "]";
	}

	@Override
	public int compareTo(Employee arg0) {
		return this.getId().compareTo(arg0.getId());
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		Employee arg=(Employee) arg0;
		return this.getId().equals(arg.getId());
	}
	
	@Override
	public int hashCode()
	{
		return this.getId();
	}
	
	
	
}
