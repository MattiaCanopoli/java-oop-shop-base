package org.lessons.java.shop;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product prodotto1 = new Product(12345,"name","description",100,22);
		
		prodotto1.showPrice();
		prodotto1.vatPrice();
		prodotto1.fullName();

	}

}
