package com.greedy.section03.exercise01;

public class MenuManager {
	
	public void listUpSandMenu() {

	MenuDTO[] sandmenus = new MenuDTO[5];
	
	sandmenus[0] = new MenuDTO("로스트치킨", "플랫브래드", "닭가슴살", "양상추", "칠리");
	sandmenus[1] = new MenuDTO("비엘티", "허니오트",	"베이컨",	"양상추",	"랜치");
	sandmenus[2] = new MenuDTO("에그마요", "위트", "계란", "양상추", "마요네즈");
	sandmenus[3] = new MenuDTO("참치", "하티", "참치", "양파", "마요네즈");
	sandmenus[4] = new MenuDTO("풀드포크",	"플랫브래드", "바베큐	", "양파", "바베큐");
	
	MenuInsertManager menuInsertManager = new MenuInsertManager();
	menuInsertManager.insert(sandmenus);
	}
	
	public void SandMenu1() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[0] = new MenuDTO("로스트치킨", "플랫브래드", "닭가슴살", "양상추", "칠리");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum1(sandmenus);
		}

	public void SandMenu2() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[1] = new MenuDTO("비엘티", "허니오트", "베이컨", "양상추", "랜치");
	
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum2(sandmenus);
		}
	
	public void SandMenu3() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[2] = new MenuDTO("에그마요", "위트", "계란", "양상추", "마요네즈");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum3(sandmenus);
		}
	
	public void SandMenu4() {

		MenuDTO[] sandmenus = new MenuDTO[5];
		sandmenus[3] = new MenuDTO("참치", "하티", "참치", "양파", "마요네즈");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum4(sandmenus);
		}
	
	public void SandMenu5() {

		MenuDTO[] sandmenus5 = new MenuDTO[5];
		sandmenus5[4] = new MenuDTO("풀드포크", "플랫브래드", "바베큐 ", "양파", "바베큐");
		
		MenuInsertManager menuInsertManager = new MenuInsertManager();
		menuInsertManager.menuNum5(sandmenus5);
		}
	
	public void listUpDrink() {
		
	String[] drink = {"1. 아메리카노", "2. 콜라", "3. 제로콜라", "4. 사이다", "5. 환타"};
	for(int i = 0; i < drink.length; i++) {
		System.out.println(drink[i]);
		}
	}
}