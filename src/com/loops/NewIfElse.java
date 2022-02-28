package com.loops;

public class NewIfElse {

	
	public static void main(String[] args) {
		int age = 17;
		String gender ="M";
		
		if(age>12 && age<18)
			System.out.println("you are in teenage");
		
		if(age==18 || age>18)
			System.out.println("you are adult now");
		
		if(age==18) {
			if(gender.equals("M")) {
				System.out.println("Male gender");
			}
			else {
				System.out.println("Female gender");
			}
		}
		else if(age<12) {
			System.out.println("You are in childhood");
		}
		else if(age<18) {
			System.out.println("You are in teenage");
		}
		else {
			System.out.println("You are adult");
		}
		
		String day = "monday";
		
		if(day.equals("Monday"))
			System.out.println("day is monday");
		else
			System.out.println("days other than monday");
	}
}
