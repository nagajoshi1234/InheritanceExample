package com.arrays;

import com.encapsulation.ClassAccessModifiers;

public class Check extends ClassAccessModifiers {
	public static void main(String[] args) {
		ClassAccessModifiers cam = new ClassAccessModifiers();
//		this.age = 55;
		//protected methods  and variables work with this object 
		// and not with new object
//		cam.ph = 55.55;
//		cam.show();
		
	}
	
	public void show2() {
		this.ph = 90.9;
		this.show();
		ClassAccessModifiers cam = new ClassAccessModifiers();
//		cam.ph = 90.23;
	}
}
