package com.loops;

public class SimpleLoopForBegineers {
public static void main(String[] args) {
	int j=0;
	for(; j<5;j++ ) {
		j = j*2;
		System.out.println(j);
	}
	System.out.println(j);
}
}
class Test{
	public void test() {
		int limit = 10;
        
        for(int i = 1;i<=limit;i++){
        	System.out.println("value of "+i);
        }
        
        for(int j=10; j>0; j--) {
        	System.out.println("value of "+j);
        }
        
        int k=0;
        
        for(; k<10; ) {
       	 System.out.print(k);
       	 k++;
        }

		int val = 0;
		while (val <= 10) {
			System.out.println("couunt " + val);
			val++;
		}
		
		val = 0;
		do {
			System.out.println("couunt " + val);
			val++;
		} while (val <= 10);
		
		
		 int limit1 = 100;
	        
         System.out.println("Prime numbers between 1 and " + limit1);
        
         //loop through the numbers one by one
         for(int i=1; i < 100; i++){
                
                 boolean isPrime = true;
                
                 //check to see if the number is prime
                 for(int j=2; j < i ; ++j){
                         if(i % j == 0){
                                 isPrime = false;
                                 break;
                         }
                 }
                 // print the number
                 if(isPrime==true) {
                         System.out.print(i + " ");
                 }
                 
                 int count = 0;
                 while(count<20) {
                	 count++;
                	 if(count<5)
                		 continue;
                	 System.out.println(count);
                 }
                 
         }
	}
}
