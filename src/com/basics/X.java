package com.basics;


	class X
	{
	    protected int i = 1221;
	     
	    void methodOfX()
	    {
	        System.out.println(i);
	    }
	
	    public static void main(String[] args)
	    {
	         X x = new X();
	         
	        System.out.println(x.i);
	         
	        x.methodOfX();
	    }
	}    
