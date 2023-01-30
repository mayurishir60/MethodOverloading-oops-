package com.overloading;

public class Test {
	void add(int a, int b) {
		System.out.println(a+b);
    }
	
	void add(int d, int e,int f) {	
		System.out.println(d+e+f);
	}  

   void add(double a, double b) {
    	System.out.println(a+b);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create object
		Test test= new Test();
		test.add(10,20);
		test.add(2,3,4);
		test.add(10.2, 11.2);
		
			  
		  }

	}


