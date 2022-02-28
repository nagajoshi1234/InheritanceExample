package com.encapsulation;

public class WrapperClasses {

	int x;
	Integer obj1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj2 = new Integer(5);
		double ll = obj2.doubleValue();
		Double dObj = new Double(555);
		Double dobj2 = Double.valueOf(666);
		Integer.valueOf(55);
//		Integer.valueOf("abcd");
		Integer obj4 =455;   //actually its new Integer(455);     //boxing
		int x = obj4; //unboxing
		Double dd = dObj + dobj2/4;
		int xx =Integer.parseInt("12");
	}

}
