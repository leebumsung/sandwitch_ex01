package com.greedy.section02.uses;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/* DTO�� Ȱ���� ������ ȸ�� ������ ���α׷� 
		 * 1. ���� ���� ȸ�� ������ �޾� �� ���� ���� ȸ�� ������ ���
		 * 2. ��ü ȸ�� ��ȸ �� ���� ���� ȸ�� ������ ��ȯ
		 * */
		
		Scanner sc = new Scanner(System.in);
		MemberManager memberManager = new MemberManager();
		
		while(true) {
			System.out.println("======= ȸ�� ���� ���α׷� ========");
			System.out.println("1. ȸ�� ���");
			System.out.println("2. ȸ�� ��ü ��ȸ");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : 
					memberManager.signUpMembers();
					break;
				case 2 : 
					memberManager.printAllMembers();
					break;
				case 9 : 
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default : 
					System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
					break;
			}
		}
		

	}

}
