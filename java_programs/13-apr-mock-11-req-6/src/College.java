import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date createdDate;
	
	public College() {}

	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date createdDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.createdDate = createdDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Integer getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", website=" + website + ", mobile=" + mobile + ", founder=" + founder
				+ ", numberOfDept=" + numberOfDept + ", location=" + location + ", createdDate=" + createdDate + "]";
	}
	
	static Map<String,Integer> calculateLocationCount(List<College> list)
	{
		Map<String, Integer> map=new TreeMap<>();
		for(College college:list)
		{
			String key = college.getLocation();
			Integer value = map.get(key);
			if(value==null)
			{
				value=0;
			}
			value++;
			map.put(key, value);		//either adds a new entry or updates exiting entry
		}
		return map;		//dummy
	}

}
