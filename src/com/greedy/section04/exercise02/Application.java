package com.greedy.section04.exercise02;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		Kiosk kiosk = new Kiosk();
				
		      while(true) {
					System.out.println("======== SUBWAY ========");
					System.out.println("1. ������ġ �޴� ����");
					System.out.println("2. ���� �޴� ����");
					System.out.println("3. �ֹ� ��� Ȯ���ϱ�");
					System.out.println("9. �ֹ� ��� �����ϱ�");
					System.out.println("0. �ֹ� ����ϱ�");
					System.out.println("========================");
					
					System.out.print("������ �����Ͻðڽ��ϱ�? : ");
					int no = sc.nextInt();
					
					switch(no) {
					case 0:
						System.out.println("���Ÿ� ����մϴ�.");
						return;
					case 1:
						kiosk.makeSandwichMenu();
						kiosk.showSandwichMenu();
						break;
					case 2:
						kiosk.showDrinkMenu();
						break;
					case 3: 
						kiosk.showOrder();
						break;
					case 9:
						kiosk.payment();
						break;
					default :
						System.out.print("�Է��Ͻ� ��ȣ�� ���⿡ �����ϴ�.");
						break;
					}
				}
			}

		}

		
	