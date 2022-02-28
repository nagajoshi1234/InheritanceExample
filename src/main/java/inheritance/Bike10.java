package main.java.inheritance;

class Bike10{  
	  
	static int speedlimit=50;
	    
	  static{
		  int newOne =12;
		  System.out.println("within static block");
	}  
	
	  Bike10(int speedlimit){  
//	  this.speedlimit=speedlimit;  
	  System.out.println(speedlimit);  	
	  }  
	  
	 // public static void main(String args[]){  
////	    Bike10 obj1 = new Bike10(70);
////	    Bike10 obj2 = new Bike10(80);
//	    Bike10.speedlimit;
//	 }  
	}  


class BikeNew{
	  public static void main(String args[]){  

//		  Bike10.speedlimit;
}
}
