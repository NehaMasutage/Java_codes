package com.edu.encapsulation;

import java.util.Scanner;

class Product{

	int pid;
	String pname;
	float pprice;

	void inputProduct(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Name of product=");
		pname=scanner.nextLine();

		System.out.println("ID of product=");
		pid=scanner.nextInt();

		System.out.println("Price of product=");
		pprice=scanner.nextFloat();
	}

	void displayProduct() {
		System.out.println("Name="+this.pname);
		System.out.println("ID="+this.pid);
		System.out.println("Price="+this.pprice);
	}
}
public class MainProduct {
	public static void main(String[] args) {

		Product product1=new Product();
		Product product2=new Product();
		Product product3=new Product();
		Product product4=new Product();

		product1.inputProduct();
		product2.inputProduct();
		product3.inputProduct();
		product4.inputProduct();

		product1.displayProduct();
		product2.displayProduct();
		product3.displayProduct();
		product4.displayProduct();	

	}

}