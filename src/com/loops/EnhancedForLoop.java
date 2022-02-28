package com.loops;

import java.util.Arrays;

public class EnhancedForLoop {

	static String[] check;
	public static void main(String[] args) {
		
	    int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
	    System.out.println(primes);
	    
	    
	    for (int t: primes) {
	    	if(t<11)
	    		continue;
	    	
	      System.out.println(t); 
	    }
	    
	    String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
	    
	    for (String sample: languages) {
	      System.out.println(sample);
	    }
	    check = new String[5];
	    
	    for(int i=0;i<3;i++){
	    	check[i] = "abcd "+Math.random();
	    	System.out.println(check[i]);
	    }

	    System.out.println(check);
	    System.out.println(Arrays.toString(check));
	  }
}
