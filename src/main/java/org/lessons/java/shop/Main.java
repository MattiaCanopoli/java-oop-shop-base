package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodotto prodotto1 = new Prodotto("name", "description", 100, 22);

		prodotto1.showPrice();
		prodotto1.vatPrice();
		prodotto1.fullName();

		Prodotto prodotto2 = new Prodotto("name", "description", 100, 22);

		prodotto2.showPrice();
		prodotto2.vatPrice();
		prodotto2.fullName();

	}

}
