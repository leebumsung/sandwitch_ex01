package com.greedy.section02.uses;

public class MemberInsertManager {
	
	public void insert(MemberDTO[] members) {
		
		System.out.println("ȸ���� ����մϴ�");
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].getName() + "���� ȸ�� ��Ͽ� �����߽��ϴ�.");
		}
		System.out.println("�� " + members.length + "���� ȸ�� ��Ͽ� �����߽��ϴ�.");
	}
}
