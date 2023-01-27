package com.greedy.section04.exercise02;

import java.util.Scanner;

public class Kiosk {

	private SandwichDTO[] sandwich = new SandwichDTO[5];
	Order order = new Order();
	Drink drink = new Drink();
	
	Scanner sc = new Scanner(System.in);
	
	public void makeSandwichMenu() {
		
		sandwich[0] = new SandwichDTO("�ν�ƮġŲ", "�÷��극��", "�߰�����", "�����", "ĥ��");
		sandwich[1] = new SandwichDTO("BLT", "��Ͽ�Ʈ", "������", "�����", "��ġ");
		sandwich[2] = new SandwichDTO("���׸���", "��Ʈ", "���", "�����", "�������");
		sandwich[3] = new SandwichDTO("��ġ", "��Ƽ", "��ġ", "����", "�������");
		sandwich[4] = new SandwichDTO("Ǯ����ũ", "�÷��극��", "�ٺ�ť", "����", "�ٺ�ť");
		
	}
	
	public void showSandwichMenu() {
		for (int i = 0; i < sandwich.length;i++) {
			System.out.println((i + 1) + ". " + sandwich[i].getName());
		}
		
		System.out.print("���Ͻô� �޴��� �������ּ��� : ");
		int no = sc.nextInt();
		
		while(true) {
			
			if(no > 0 && no < 6) {
				order.makeOrder(sandwich[no - 1]);
				break;
			} else {
				System.out.println("�Է��Ͻ� ��ȣ�� ���⿡ �����ϴ�.");
				continue;
			}
		}
	}
	
	public void showDrinkMenu() {
		drink.showDrink();
		
		System.out.print("���Ͻô� �޴��� �������ּ��� : ");
		int no = sc.nextInt();
		
		while(true) {
			
			if(no > 0 && no < 6) {
				order.makeDrinkOrder(no);
				break;
			} else {
				System.out.println("�Է��Ͻ� ��ȣ�� ���⿡ �����ϴ�.");
				continue;
			}
		}
	}

	public void showOrder() {
		order.showOrder();
		order.showDrinkOrder();
	}

	public void payment() {
		System.out.println("������ �����Ͻðڽ��ϱ�? : \n1. �� \n2. �ƴϿ�");
		int no = sc.nextInt();
		
		switch(no) {
		case 1:
			System.out.println("���������� ������ �����߽��ϴ�.");
			return;
		case 2:
			System.out.println("������ ����ϰ� ���ư��ϴ�.");
			break;
		}
	}
}
