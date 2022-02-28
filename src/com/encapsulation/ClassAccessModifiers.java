package com.encapsulation;

public class ClassAccessModifiers {
	
	String category;  //default modifier visible in same class and other class in same package only.
	public int age;  //visible all-around
	protected double ph;		//visible in same class and in other class in same package in other package only in its sub class
	private long noOfCountries;    //visible only in the same class
	
	protected void show(){
		System.out.println("hello");
		
//		modifier        class			variable				method			constructor
//		public			Y					Y						Y				Y
//		private			N					Y						Y				Y
//		protected		N					Y						Y				Y		
//		default			Y					Y						Y				Y
		
	}

	

}
class def{
	public static void main(String[] args) {
		ClassAccessModifiers cam = new  ClassAccessModifiers();
//		cam.ph
		System.out.println("ssssssssssssssssssss");
	}
	
	
}