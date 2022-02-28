package com.arrays;

public class StringCharCount {

	public static void main(String[] args) {
		String val1 = new String("Chandigarh is a beautiful city");
		String val = "Chandigarh is a beautiful city";
		String val2 = val1.intern();
		System.out.println(val2 == val);
		System.out.println("aaaaaaaaaaaaaaaaaa " +val.intern().equals(val1.intern()));
		System.out.println(val.intern());
		System.out.println(val);
		System.out.println(val1.intern());
		 char ch = val.charAt(5);
		 System.out.println(val.length());
		 
		 for (int i=val.length()-1; i>=0; i--) {
			 char ch1 = val.charAt(i);
			 System.out.print(ch1);
		 }
		 
		 String ab = "tech Mahindra";
		 String df = new String("tech Mahindra");
		 System.out.println(ab == df);
		 System.out.println(ab.intern() == df.intern());
	}
}
