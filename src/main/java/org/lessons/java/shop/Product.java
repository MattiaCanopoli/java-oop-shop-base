package org.lessons.java.shop;

public class Product {
	
	int productCode;
	String productName;
	String productDescription;
	int productPrice;
	int vat;
	
	
	public Product (int productCode, String productName,String productDescription,int productPrice, int vat) {
		this.productCode=productCode;
		this.productName=productName;
		this.productDescription=productDescription;
		this.productPrice=productPrice;
		this.vat=vat;

	}
	
	public void showPrice() {
		System.out.println(productPrice + "€");
	}
	
	public void vatPrice() {
		int vatPrice=productPrice + ((productPrice*vat)/100);
		System.out.println(vatPrice + "€");
	}
	
	public void fullName() {
		System.out.println(productCode+productName);
	}
	

}


