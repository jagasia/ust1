package com.ust.spring.entity;



public class Food {
	private Integer id;
	private String name;
	private Double price;
	private byte[] photo;
	private String photo1;
	
	public Food() {}

	public Food(Integer id, String name, Double price, byte[] photo) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.photo = photo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public byte[] getPhoto() {
		return photo;
	}
	

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", photo=" + photo.length + "]";
	}
	
}
