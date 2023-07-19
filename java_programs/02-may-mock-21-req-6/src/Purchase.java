import java.util.Date;

public class Purchase {
	private Integer id;
	private Double price;
	private String couponCode;
	private Date purchaseDate;
	private User user;
	
	public Purchase() {}

	public Purchase(Integer id, Double price, String couponCode, Date purchaseDate, User user) {
		super();
		this.id = id;
		this.price = price;
		this.couponCode = couponCode;
		this.purchaseDate = purchaseDate;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
