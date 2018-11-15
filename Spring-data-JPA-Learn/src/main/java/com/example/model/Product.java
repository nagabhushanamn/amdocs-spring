package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
@NamedQueries({
	@NamedQuery(name="Product.byPrice",query="from Product p where p.price=?1"),
})
public class Product {

	@Id
	private int id;
	private String name;
	private double price;
	private Date make_date;
	private String image;
	private String description;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", make_date=" + make_date + ", image="
				+ image + ", description=" + description + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getMake_date() {
		return make_date;
	}

	public void setMake_date(Date make_date) {
		this.make_date = make_date;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
