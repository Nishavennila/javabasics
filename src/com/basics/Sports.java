package com.basics;

public class Sports extends Car {
	public Sports() {
		System.out.println("Sports car");
	}
@Override
	public void brake() {
		System.out.println("Sorts is brake");
	}
	public static void main(String[] args) {
		Sports s1=new Sports();
		Car car=new Car();
		s1.brake();
		car.brake();
	}
}
