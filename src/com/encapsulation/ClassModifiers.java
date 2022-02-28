package com.encapsulation;

public class ClassModifiers {
	public static void main(String[] args) {
		ClassAccessModifiers cam = new  ClassAccessModifiers();
//	
		System.out.println(cam.category);
		System.out.println(cam.age);
		System.out.println(cam.ph);
		
		
		Humans hum = new Humans();
		hum.setCategorymf("M");
		System.out.println(hum.getCategorymf());
		
	}

}
