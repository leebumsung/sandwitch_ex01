package com.greedy.section01.init;

public class Car {
	
	private String modelName;
	private int maxSpeed;
	
	public Car(String modelName, int maxSpeed) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}
	
	public void driveMaxSpeed(/* String modelName, int maxSpeed */) {
		
		System.out.println(modelName + "��(��) �ְ�ü� " + maxSpeed + "km/h�� �޷����ϴ�.");
	}
}
