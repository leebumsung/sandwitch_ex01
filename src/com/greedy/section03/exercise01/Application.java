package com.greedy.section03.exercise01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MenuManager menumanager = new MenuManager();
		while(true) {
			System.out.println("=========== �޴� ȭ�� ==========");
			System.out.println("1. ������ġ �޴�");
			System.out.println("2. ���� �޴�");
			System.out.println("9. ����");
			System.out.println("�޴��� �����ϼ��� : ");
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
				System.out.println("�������ּ���");
				return;
			default :
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				break;
			}
			System.out.println();
		}
	}
	
	private static void choiseDrink() {
	
		Scanner sc = new Scanner(System.in);
		MenuManager menuM = new MenuManager();
		
		while(true) {
			System.out.println("=========== ���� ȭ�� ==========");
			System.out.println("1. �Ƹ޸�ī��");
			System.out.println("2. �ݶ�");
			System.out.println("3. �����ݶ�");
			System.out.println("4. ���̴�");
			System.out.println("5. ȯŸ");
			System.out.println("6. ���θ޴��� ���ư��ϴ�.");
			System.out.println("�޴��� �����ϼ��� : ");
			
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
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				break;
			}
		}
	}

	private static void choiceSandMenu() {
		
		Scanner sc = new Scanner(System.in);
		MenuManager menuM = new MenuManager();
		
		while(true) {
			System.out.println("=========== ������ġ ȭ�� ==========");
			System.out.println("1. �ν�ƮġŲ");
			System.out.println("2. ��Ƽ");
			System.out.println("3. ���׸���");
			System.out.println("4. ��ġ");
			System.out.println("5. Ǯ����ũ��");
			System.out.println("6. ���θ޴��� ���ư��ϴ�.");
			System.out.println("�޴��� �����ϼ��� : ");
			
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
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				break;
			}
		}
	}
}