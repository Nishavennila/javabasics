package com.basics;

public class Taxi extends Car {
	public Taxi() {
		//super();
		int i=10;
		System.out.println("Taxi empty cons");
	}
	public Taxi(int i) {

		System.out.print("taxi args"+i);
	}
	@Override
	public void brake() {
		System.out.println("brake is taxi");
	}
	//object substitution
	public static void main(String[] args) {
		//(Taxi taxi=new Taxi);
		//taxi.brake();
	Car car=new Taxi();
	car.brake();
	System.out.println(car.i);
	System.out.println(car instanceof Taxi);
	}
}