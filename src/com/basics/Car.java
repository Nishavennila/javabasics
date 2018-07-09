package com.basics;

public class Car {

 int speed;
 int i=100;
 public Car() {
	 System.out.println("car empty cons");
 }   
 public Car(int speed) {
	 //super();
	 this();
	 this.speed=speed;
	 System.out.println("car args"+speed);
 }
private void brake() {
	System.out.println("car brake is part");
	
}
public static void main(String[] args) {
	Car car=new Car(45);
	//car.speed(100);
	car.brake();

}}
