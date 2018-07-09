package com.basics;

public class Police extends Car {
	public Police() {
		System.out.println("Police is empty");
	}
@Override
	public void brake() {
		System.out.println("brake is police car");
	}
	public static void main(String[] args) {
		Police p1=new Police();
		p1.brake();
		
	}

}
