package com.basics;

import com.basics.Car;
import com.basics.Police;
import com.basics.Sports;
import com.basics.Taxi;

public class PolyTest {
	public static void main(String[] args) {
		
	PolyTest pt=new PolyTest();
	Police p1=new Police();
	Sports s1=new Sports();
	Taxi taxi=new Taxi();
	
	//Polymorphism	
	pt.brake(p1);
	pt.brake(s1);
	pt.brake(taxi);
	
	
}
public void brake(Car car) {

        car.brake();
}
}
