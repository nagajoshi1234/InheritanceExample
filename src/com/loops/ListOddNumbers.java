
package com.loops;

public class ListOddNumbers {

	  public static void main(String[] args) {
          
          //define the limit
          int limit = 50;
         
          System.out.println("Printing Odd numbers between 1 and " + limit);
          int i = 1;
          for(;i<=limit;i++){
        	 
        	  	//if the number is not divisible by 2 then it is odd
                  if( i % 2 == 1) {
                     System.out.print(i + " ");
                  }
          }
//          while(i<=limit){
//
//      	  	//if the number is not divisible by 2 then it is odd
//                if( i % 2 == 1) {
//                   System.out.print(i + " ");
//                }
//                i++;
//        }
//          do{
//
//      	  	//if the number is not divisible by 2 then it is odd
//                if( i % 2 == 1) {
//                   System.out.print(i + " ");
//                }
//                i++;
//        }while(i<=limit);
          
          System.out.println();
          System.out.println(i);
          for(; i>=0; i--) {
        	  
          }
          System.out.println(i);
          for(int ii = 1,j=1; ii < limit && j<limit; ii++,j++){
              System.out.println(ii);
               //if the number is not divisible by 2 then it is odd
               if( ii % 2 != 0)
                  System.out.print(ii + " ");
       }
          
         String val ="ram";
         
         int result = val.equals("ram") ? 55:56; 
         val = val.equals("ram") ? "gaurav":"ravi";
         
         int k=0;
         
         for(; k<10; ) {
        	 System.out.print(k);
        	 k++;
         }
         System.out.println();
          System.out.println(k);
  }
}

