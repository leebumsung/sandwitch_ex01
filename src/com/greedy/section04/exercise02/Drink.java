package com.greedy.section04.exercise02;

public class Drink {

	private String[] drink = new String[] {"�Ƹ޸�ī��", "�ݶ�", "���� �ݶ�", "���̴�", "ȯŸ"};
	
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
