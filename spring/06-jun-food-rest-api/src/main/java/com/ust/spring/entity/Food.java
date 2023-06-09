package com.ust.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

import org.apache.tomcat.util.codec.binary.Base64;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Double price;
	@Lob
	private byte[] photo;
	@Transient
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
	
	public String getPhoto1()
	{
		this.photo1=Base64.encodeBase64String(this.photo);
		return photo1;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", photo=" + photo.length + "]";
	}
	
}
