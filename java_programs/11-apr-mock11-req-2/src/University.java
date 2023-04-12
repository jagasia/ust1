import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class University {
	private String name;
	private List<College> collegeList;

	public University() {
		collegeList=new ArrayList<College>();
	}

	public University(String name, List<College> collegeList) {
//		this();
		this.name = name;
		this.collegeList = collegeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}

	public void addCollegeToUniversity(College college) {
		collegeList.add(college);
	}

	public Boolean removeCollege(String name) {
//		College college = null;
		// to find the college using its name, i loop all elements of collegeList
//		for (int i = 0; i < collegeList.size(); i++) {
		for(College c : collegeList) {
//			College c = collegeList.get(i);

			if (c.getName().equals(name)) {
//				college = c;
				return collegeList.remove(c);
//				break;
			}
		}
		return false;
//		return collegeList.remove(college);
	}

	public void displayColleges() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name", "Website", "Mobile", "Founder",
				"Number of Dept", "Location", "Starting Date");
		for (int i = 0; i < collegeList.size(); i++) {
			College c = collegeList.get(i);
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", c.getName(), c.getWebsite(), c.getMobile(),
					c.getFounder(), c.getNumberOfDept(), c.getLocation(), sdf.format(c.getStartingDate()));
		}
	}

}
