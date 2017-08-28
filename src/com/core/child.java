package com.core;

public class child extends parent {
	
	public void add(int x,int y) {
		System.out.println(x-y);
	}
		
    public static void divide(int x,int y)
    {
    	System.out.println(x/y);
    	
    }
    
    void multi(int x,int y)
    {
    	System.out.println(x*y);
    }
   
    
    public static void main(String [] args) {
    	parent p = new child();
    	p.add(5,5);
    	
    	
    }

}
