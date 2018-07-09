package com.basics;

import java.util.Scanner;

public class Lastdigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		
			if(n>=-9 && n<9 ) {
				System.out.println(false);
			}
			else
			if(n<0) {
				n=-n;
			}
			 if(n>0) {
			int r=n%100;
			int s=r/10;
		
		System.out.println(s);
		}	
	}

}