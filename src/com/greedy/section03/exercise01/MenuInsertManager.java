package com.greedy.section03.exercise01;

import java.util.Scanner;

public class MenuInsertManager {
	
	MenuManager manuManager = new MenuManager();
	Scanner sc = new Scanner(System.in);
	
	public void insert(MenuDTO[] menus) {
		System.out.println("샌드위치 메뉴입니다.");
		
		for(int i = 0; i < menus.length; i++) {
			System.out.println((i + 1) + "." + menus[i].getSandwitch());
		}
	}
	
	public void menuNum1(MenuDTO[] menus) {
		System.out.println(menus[0].getInformation());
	}
	
	public void menuNum2(MenuDTO[] menus) {
		System.out.println(menus[1].getInformation());
	}
	
	public void menuNum3(MenuDTO[] menus) {
		System.out.println(menus[2].getInformation());
	}
	
	public void menuNum4(MenuDTO[] menus) {
		System.out.println(menus[3].getInformation());
	}
	
	public void menuNum5(MenuDTO[] menus) {
		System.out.println(menus[4].getInformation());
	}
}
