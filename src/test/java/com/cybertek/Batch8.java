package com.cybertek;

import com.github.javafaker.Faker;

public class Batch8 {

	public static void main(String[] args) {
		System.out.println("ABCCGH");
		Faker faker = new Faker();
		String creditCard = faker.finance().creditCard();
		System.out.println(creditCard);
		System.out.println(faker.shakespeare().hamletQuote());

	}

}
