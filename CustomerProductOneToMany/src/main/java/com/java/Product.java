package com.java;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	@Column(name="productname", length=50, nullable=false)
	private String productname;
	@Column(name="productprice", length=25, nullable=false)
	private float productprice;

	//one course many student
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="productid")
	private List<Customer> customerlist;//setter and getter method for this
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String productname, float productprice) {
		super();
		this.productname = productname;
		this.productprice = productprice;
	}
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getProductprice() {
		return productprice;
	}
	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}
	
	public List<Customer> getCustomerlist() {
		return customerlist;
	}
	

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}


	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productfees=" + productprice
				+ ", getProductid()=" + getProductid() + ", getProductname()=" + getProductname() + ", getProductfees()="
				+ getProductprice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
