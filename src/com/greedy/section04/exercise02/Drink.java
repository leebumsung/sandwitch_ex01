package com.greedy.section04.exercise02;

public class Drink {

	private String[] drink = new String[] {"아메리카노", "콜라", "제로 콜라", "사이다", "환타"};
	
	public String getDrink(int no) {
		
		return drink[no];
	}
	
	public void showDrink() {
		System.out.println("====Drink====");
		for (int i = 0; i < drink.length; i++) {
			System.out.println((i + 1) + ". " + drink[i]);
		}
	}
}
