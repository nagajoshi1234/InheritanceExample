package com.arrays;

public class CountSpecialChars {
	
	public static void main(String[] args) {
		String val= "Mfgh%dfg$dfg#sdf#sdf#";
		int index = 0;
		int sp =0;
		for(; index<val.length(); index++) {
			char ch = val.charAt(index);
			if(ch=='%' || ch=='$' || ch=='#') {
				System.out.println(ch+"    "+index);
				sp++;
			}
		}
		System.out.println(sp);		
	}
}

