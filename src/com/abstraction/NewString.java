package com.abstraction;

public class NewString {
	public static void main(String[] args) {
		String a1 = "england";
		String a2 = "England";
		String a3 = new String("england");
		System.out.println(a1==a3);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a3));
		a3 = a3.intern();
		System.out.println(a1==a3);
	}
}
