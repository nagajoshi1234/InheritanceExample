package com.abstraction;

public class ClassSolid extends MySecondClass {

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("ddd");
	}
	
	public void calc() {
		System.out.println("printing");
	}
	
	public static void main(String[] args) {
		MyFirstAbstractClass1 obj = new ClassSolid();	//upcasting
		((ClassSolid) obj).calc();		//class casting
		obj.addition();
		obj.division();
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		
	}
	
	

}
