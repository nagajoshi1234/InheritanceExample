package com.loops;

public class PascalTriangleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dummy = 0;
		for(int i=7;i>0; i--){
			int j=i-1;
			dummy = 0;
			for(;j>0;j--){
				System.out.print(" ");
				dummy++;
			}
//			System.out.println(dummy);
			int decreaseCount = 0;
			for(;dummy<7;dummy++) {
				System.out.print("*");
				if(i!=7)
				decreaseCount++;
			}
			for(;decreaseCount>0;decreaseCount--)
				System.out.print("*");
			System.out.println();
			
		}

	}


}