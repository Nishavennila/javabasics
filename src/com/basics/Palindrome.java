package file.basics;

import java.util.Scanner;

public class Palindrome {
	    public static String longestPalindrome(String s) {
	    	 Scanner sc=new Scanner(System.in);
	    	 String s1=sc.next();
	        for (int i = s.length(); i > 0; i--)
	            for (int j = 0; j <= s.length() - i; j++) {
	                String substring = s.substring(j, j + i);
	                if (isPalindrome(substring))
	                   return substring; 
	            }
	        return s;
	    }  
	    public static boolean isPalindrome(String s) {
	        int limit = s.length() / 2;
	        for (int i = 0; i <= limit; i++)
	            if (s.charAt(i) != s.charAt(s.length() - i - 1))
	                return false;
	        return true; 
	    }
	}




	  