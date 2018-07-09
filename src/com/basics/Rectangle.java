package com.basics;

import java.util.Scanner;

public class Rectangle {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	
	 System.out.println("enter the breadth value: ");
	 int breadth=s1.nextInt(); 
	
	System.out.println("enter the length: ");
	int length=s1.nextInt();
	int area=length * breadth;
	System.out.println(area);
}
}
 