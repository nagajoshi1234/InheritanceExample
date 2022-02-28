package com.loops;

public class JavaFibonacciSeriesExample {

	  public static void main(String[] args) {
          
          //number of elements to generate in a series
          int limit = 20;
         
          long[] series = new long[limit];
         
          //create first 2 series elements
          series[0] = 0;
          series[1] = 1;
         
          //create the Fibonacci series and store it in an array
          for(int i=2; i < limit; i++){
                  series[i] = series[i-1] + series[i-2];
          }
         
          //print the Fibonacci series numbers
         
          System.out.println("Fibonacci Series upto " + limit);
          int i=0;
          do{
                  System.out.print(series[i] + " ");
                  i++;
          }while( i< limit );
  }
}
