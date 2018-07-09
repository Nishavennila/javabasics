package com.basics;

public class Multiple {
	public static void main(String[] args) {
		Multiple hfi=new Multiple();
		System.out.println(hfi.isMultiple(34,56));
		System.out.println(hfi.isEven(54));
		System.out.println(hfi.ispalindrome(456));
	System.out.println(hfi.isPerfectnumber(6));
	}
	
	public boolean isMultiple(int s,int y) {
		return s % y == 0 ? true : false;
	}
public boolean isEven(int e) {
if(e % 2 == 0) 
	return true;

	else
	
		return false;
}
public boolean isPerfectnumber(int number) {
	int sum=0;
	for(int i=1;i<=number/2;i++) {
		if(number % i == 0)
			sum=sum+i;
	}
	
	return sum == number ? true :false;
}
public double converttop(double fathrenheit) {
	return 9.0 / 5.0 * (fathrenheit - 32);
}
public double convert(double celsius) {
	return 9.0 / 5.0 * celsius + 32;
}

public boolean ispalindrome(int i) {
int  t,sum=0,temp;
temp=i;
while(i>0)
{
	t=i % 10;
	sum=(sum * 10)+t;
	i=i / 10;
}
return temp==sum ? true : false;
}
}


