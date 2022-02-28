package com.arrays;

public class StringSplitClass {
	public static void main(String[] args) {
		String str = "Chandigarh@is@a@b.ea$utiful@city";
//		str = "c:\\Users\\desktop\\amit\\abc.txt";
		String def[] = null;
		String abc[] = str.split("\\$");
		for(String ss : abc)
			System.out.println(ss);
		
		System.out.println(abc.length);
//		System.out.println(def.length);
		String val = "ravi;kavi;suman;raman";
		String[] arr = val.split(";");
		
		for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);
	
	}
}
