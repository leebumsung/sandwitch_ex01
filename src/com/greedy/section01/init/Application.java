package com.greedy.section01.init;

public class Application {

	public static void main(String[] args) {
		
		Car car1 = new Car("���", 300);
		Car car2 = new Car("���������", 350);
		Car car3 = new Car("�ѽ����̽�", 250);
		Car car4 = new Car("�ΰ�Ƽ���̷�", 400);
		Car car5 = new Car("����", 500);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		Car[] carArray = new Car[5];
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println("carArray[" + i + "] : " + carArray[i]);
		}
		
//		carArray[0].driveMaxSpeed();
		
		carArray[0] = new Car("���", 300);
		carArray[1] = new Car("���������", 350);
		carArray[2] = new Car("�ѽ����̽�", 250);
		carArray[3] = new Car("�ΰ�Ƽ���̷�", 400);
		carArray[4] = new Car("����", 500);
//		carArray[5] = new Car("�ظ�����", 1000);
		
		for(int i = 0; i < carArray.length; i++) {
			carArray[i].driveMaxSpeed();
		}
		
		Car[] carArray2 = {
				new Car("���", 300), 
				new Car("���������", 350), 
				new Car("�ѽ����̽�", 250), 
				new Car("�ΰ�Ƽ���̷�", 400), 
				new Car("����", 500)
				};
		
		for(Car c : carArray2) {
			c.driveMaxSpeed();
		}
		
	}

}
