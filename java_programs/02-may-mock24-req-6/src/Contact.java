import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contact {
	private String name;
	private String mobileNumber;
	private String mailId;
	private Date dob;
	
	public Contact() {}

	public Contact(String name, String mobileNumber, String mailId, Date dob) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public static List<Contact> prefill()throws ParseException{
		List<Contact> contactList = new ArrayList<>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		contactList.add(new Contact("John","9876543210","john@gmail.com",sdf.parse("31/01/1990")));
		contactList.add(new Contact("Grace","9898798652","grace@gmail.com",sdf.parse("27/02/1987")));
		contactList.add(new Contact("Wayne","9787621230","wayne@gmail.com",sdf.parse("15/09/1988")));
		contactList.add(new Contact("Joe","9879865898","joe@gmail.com",sdf.parse("23/07/1992")));
		contactList.add(new Contact("David","9856985620","david@gmail.com",sdf.parse("24/05/1982")));
		contactList.add(new Contact("Jane","9765659820","jane@gmail.com",sdf.parse("13/03/1993")));
		contactList.add(new Contact("Choe","9595878580","choe@gmail.com",sdf.parse("26/09/1989")));
		contactList.add(new Contact("Chris","9659659790","chris@gmail.com",sdf.parse("15/03/1993")));
		return contactList;
		}

}
