package com.greedy.section02.uses;

public class MemberManager {
	
	public void signUpMembers() {
		
		MemberDTO[] members = new MemberDTO[5];
		
		members[0] = new MemberDTO(1, "user01", "pass01", "ȫ�浿", 20, '��');
		members[1] = new MemberDTO(2, "user02", "pass02", "������", 16, '��');
		members[2] = new MemberDTO(3, "user03", "pass03", "�̼���", 40, '��');
		members[3] = new MemberDTO(4, "user04", "pass04", "�Ż��Ӵ�", 36, '��');
		members[4] = new MemberDTO(5, "user05", "pass05", "������", 22, '��');
		
		MemberInsertManager memberInsertManager = new MemberInsertManager();
		memberInsertManager.insert(members);
	}
	
	public void printAllMembers() {
		
		MemberDTO[] selectedMembers = new MemberSelectManager().selectAllMembers();
		
		System.out.println("----------- ���Ե� ȸ�� ��� --------------");
		for(MemberDTO member : selectedMembers) {
			System.out.println(member.getInformation());
		}
		System.out.println("---------------------------------------");
		System.out.println("�� " + selectedMembers.length + "���� ȸ���� ���ԵǾ� �ֽ��ϴ�.");
	}
}
