package com.greedy.section03.exercise01;

public class MenuManager {
	
	public void listUpSandMenu() {

	MenuDTO[] sandmenus = new MenuDTO[5];
	
	sandmenus[0] = new MenuDTO("�ν�ƮġŲ", "�÷��귡��", "�߰�����", "�����", "ĥ��");
	sandmenus[1] = new MenuDTO("��Ƽ", "��Ͽ�Ʈ",	"������",	"�����",	"��ġ");
	sandmenus[2] = new MenuDTO("���׸���", "��Ʈ", "���", "�����", "�������");
	sandmenus[3] = new MenuDTO("��ġ", "��Ƽ", "��ġ", "����", "�������");
	sandmenus[4] = new MenuDTO("Ǯ����ũ",	"�÷��귡��", "�ٺ�ť	", "����", "�ٺ�ť");
	
	MenuInsertManager menuInsertManager = new MenuInsertManager();
	menuInsertManager.insert(sandmenus);
	}
	
	public void SandMenu1() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[0] = new MenuDTO("�ν�ƮġŲ", "�÷��귡��", "�߰�����", "�����", "ĥ��");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum1(sandmenus);
		}

	public void SandMenu2() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[1] = new MenuDTO("��Ƽ", "��Ͽ�Ʈ", "������", "�����", "��ġ");
	
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum2(sandmenus);
		}
	
	public void SandMenu3() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[2] = new MenuDTO("���׸���", "��Ʈ", "���", "�����", "�������");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum3(sandmenus);
		}
	
	public void SandMenu4() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[3] = new MenuDTO("��ġ", "��Ƽ", "��ġ", "����", "�������");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum4(sandmenus);
		}
	
	public void SandMenu5() {

		MenuDTO[] sandmenus5 = new MenuDTO[5];
		sandmenus5[4] = new MenuDTO("Ǯ����ũ", "�÷��귡��", "�ٺ�ť ", "����", "�ٺ�ť");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum5(sandmenus5);
		}
	
	public void listUpDrink() {
		
	String[] drink = {"1. �Ƹ޸�ī��", "2. �ݶ�", "3. �����ݶ�", "4. ���̴�", "5. ȯŸ"};
	for(int i = 0; i < drink.length; i++) {
		System.out.println(drink[i]);
		}
	}
}