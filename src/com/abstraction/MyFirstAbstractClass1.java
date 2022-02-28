package com.abstraction;

public abstract class MyFirstAbstractClass1 {

	int one, two;
	double three, four;
	
	public MyFirstAbstractClass1(){

	}
	
	public void average(){
//		int avResult = (one + two)/2;
		int avResult = (1 + 2)/2;
	}
	
	public void addition(){
		double addResult = 1+2+3+4;
		System.out.println("answer is "+ addResult);
	}
	
	abstract public void multiplication();
	public abstract void division();

}
