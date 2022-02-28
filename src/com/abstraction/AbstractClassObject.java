package com.abstraction;

public class AbstractClassObject {
	public static void main(String[] args) {
		MyFirstAbstractClass1 mfc = new MyFirstAbstractClass1() {
			
			@Override
			public void multiplication() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void division() {
				// TODO Auto-generated method stub
				
			}
		};
		mfc.addition();
		mfc.multiplication();
	}
	
}
