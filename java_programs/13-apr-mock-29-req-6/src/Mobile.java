import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mobile {
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;
	private Date launchedDate;
	
	public Mobile() {}

	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	
	static Mobile createMobile(String detail) throws ParseException
	{
//		#SM 48 DUO-004,J7 Duo,5.6,17000,23-09-2016
		String[] arr = detail.split(",");
		Mobile mobile=new Mobile();
		mobile.setReferenceId(arr[0]);
		mobile.setModelName(arr[1]);
		mobile.setDisplaySize(Double.valueOf(arr[2]));
		mobile.setPrice(Double.valueOf(arr[3]));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		mobile.setLaunchedDate(sdf.parse(arr[4]));
		return mobile;
	}
	public static Map<Date,Integer> yearWiseCount(List<Mobile> mobileList) throws ParseException
	{
		Map<Date,Integer> map=new TreeMap<Date, Integer>();
		for(Mobile mobile:mobileList)
		{
			Date dt = mobile.getLaunchedDate();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
			String year=sdf.format(dt); 
			Date date=sdf.parse(year);
			Integer count = map.get(date);
			if(count==null)
			{
				count=0;
			}
			count++;
			map.put(date, count);
		}
		return map;
	}

	
}
