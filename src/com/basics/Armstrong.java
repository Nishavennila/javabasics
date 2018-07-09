package com.basics;

public class Armstrong {
	public static void main(String[] args) {
	Armstrong a1=new Armstrong();
	System.out.println(a1.Armstrong(153));
	}
public boolean Armstrong (int n) {
	int r,s=0,temp=n;
	while(n!=0)
	{
		r=n%10;
		s=s+(r*r*r);
		n=n/10;
	}	
return s==temp ? true : false;
}
}
