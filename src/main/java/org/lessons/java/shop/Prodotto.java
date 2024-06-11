package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	Random code = new Random();
	int productCode = code.nextInt(99999);;
	String productName;
	String productDescription;
	int productPrice;
	int vat;

	public Prodotto(String productName, String productDescription, int productPrice, int vat) {
//		this.productCode=productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.vat = vat;
	}

	public void showPrice() {
		System.out.println(productPrice + "€");
	}

	public void vatPrice() {
		int vatPrice = productPrice + ((productPrice * vat) / 100);
		System.out.println(vatPrice + "€");
	}

	public void fullName() {
		System.out.println(productCode + productName);
	}

}
