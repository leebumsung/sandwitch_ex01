package com.greedy.section03.exercise01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MenuManager menumanager = new MenuManager();
		while(true) {
			System.out.println("=========== 메뉴 화면 ==========");
			System.out.println("1. 샌드위치 메뉴");
			System.out.println("2. 음료 메뉴");
			System.out.println("9. 결제");
			System.out.println("메뉴를 선택하세요 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				choiceSandMenu();
//				menumanager.listUpSandMenu();
				break;
			case 2 :
				choiseDrink();
//				menumanager.listUpDrink();
				break;
			case 9 :
				System.out.println("결제해주세요");
				return;
			default :
				System.out.println("잘못된 번호입니다.");
				break;
			}
			System.out.println();
		}
	}
	
	private static void choiseDrink() {
	
		Scanner sc = new Scanner(System.in);
		MenuManager menuM = new MenuManager();
		
		while(true) {
			System.out.println("=========== 음료 화면 ==========");
			System.out.println("1. 아메리카노");
			System.out.println("2. 콜라");
			System.out.println("3. 제로콜라");
			System.out.println("4. 사이다");
			System.out.println("5. 환타");
			System.out.println("6. 메인메뉴로 돌아갑니다.");
			System.out.println("메뉴를 선택하세요 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				menuM.listUpDrink();
				break;
			case 2 :
				menuM.listUpDrink();
				break;
			case 3 :
				menuM.listUpDrink();
				break;
			case 4 :
				menuM.listUpDrink();
				break;
			case 5 :
				menuM.listUpDrink();
				break;
			case 6 :
				return;
			default :
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}
	}

	private static void choiceSandMenu() {
		
		Scanner sc = new Scanner(System.in);
		MenuManager menuM = new MenuManager();
		
		while(true) {
			System.out.println("=========== 샌드위치 화면 ==========");
			System.out.println("1. 로스트치킨");
			System.out.println("2. 비엘티");
			System.out.println("3. 에그마요");
			System.out.println("4. 참치");
			System.out.println("5. 풀드포크요");
			System.out.println("6. 메인메뉴로 돌아갑니다.");
			System.out.println("메뉴를 선택하세요 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				menuM.SandMenu1();
				break;
			case 2 :
				menuM.SandMenu2();
				break;
			case 3 :
				menuM.SandMenu3();
				break;
			case 4 :
				menuM.SandMenu4();
				break;
			case 5 :
				menuM.SandMenu5();
				break;
			case 6 :
				return;
			default :
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}
	}
}