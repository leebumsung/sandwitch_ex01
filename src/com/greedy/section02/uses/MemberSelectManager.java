package com.greedy.section02.uses;

public class MemberSelectManager {
	
	public MemberDTO[] selectAllMembers() {
		
		return new MemberDTO[] {
				new MemberDTO(1, "user01", "pass01", "ȫ�浿", 20, '��'),
				new MemberDTO(2, "user02", "pass02", "������", 16, '��'),
				new MemberDTO(3, "user03", "pass03", "�̼���", 40, '��'),
				new MemberDTO(4, "user04", "pass04", "�Ż��Ӵ�", 36, '��'),
				new MemberDTO(5, "user05", "pass05", "������", 22, '��')
		};
	}
}
