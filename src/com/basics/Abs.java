package com.basics;

public abstract class Abs {
public Abs() {
	System.out.println("empty cons");
}
public abstract void getitem();

public static void main(String[] args) {
	//Abs a1=new Abs();
	Subabs s1=new Subabs(10);
	s1.getitem();
}
}
class Subabs extends Abs{
	public Subabs() {
		System.out.println("sub constructor");
	}
	public Subabs(int i) {
		System.out.println("sub is"+i);
	}

	@Override
	public void getitem() {
		// TODO Auto-generated method stub
	System.out.println("abs implement of subabs");	
	}
	
}