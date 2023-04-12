import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private Date dateOfJoining;
	private String email;
	
	public Employee() {}

	public Employee(Integer id, String firstName, String lastName, Date dateOfJoining, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.email = email;
	}
	
	public Employee(Integer id, String firstName, String lastName, String doj, String email) throws ParseException {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		this.dateOfJoining = sdf.parse(doj);
		this.email = email;
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

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfJoining="
				+ dateOfJoining + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return firstName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee) obj;
		return this.getFirstName().equals(e.getFirstName());
	}
	
	
	
}
