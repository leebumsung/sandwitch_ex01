package com.greedy.section04.exercise02;

public class SandwichDTO {

	private String name;
	private String bread;
	private String main;
	private String veggie;
	private String sauce;
	
	/**
	 * ������ġ�� ��ü�� �Ʒ� 4���� �Ű����� ���� ������ �� ����. 
	 * @param name ���õ� ������ġ�� �̸�
	 * @param bread ���õ� ���� ����
	 * @param main ���õ� ���� ���(�ַ� ����)�� ����
	 * @param veggie ���õ� ��ä�� ����
	 * @param sauce ���õ� �ҽ��� ����
	 */
	public SandwichDTO(String name, String bread, String main, String veggie, String sauce) {
		super();
		this.name = name;
		this.bread = bread;
		this.main = main;
		this.veggie = veggie;
		this.sauce = sauce;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getVeggie() {
		return veggie;
	}

	public void setVeggie(String veggie) {
		this.veggie = veggie;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public void printAllInfo() {
		System.out.println("�޴��� : " + name);
		System.out.println("�� : " + bread);
		System.out.println("���� : " + main);
		System.out.println("��ä : " + veggie);
		System.out.println("�ҽ� : " + sauce);
	}
}
