import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	public static Mobile createMobile(String detail) throws ParseException
	{
		Mobile mobile=new Mobile();
//		#SM 45 JJ6-001,Galaxy J6,5.6,13990,02-01-2017
		String[] arr = detail.split(",");
		mobile.setReferenceId(arr[0]);
		mobile.setModelName(arr[1]);
		mobile.setDisplaySize(Double.parseDouble(arr[2]));
		mobile.setPrice(Double.parseDouble(arr[3]));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		mobile.setLaunchedDate(sdf.parse(arr[4]));
		return mobile;
	}

}
