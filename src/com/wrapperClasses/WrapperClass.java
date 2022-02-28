package com.wrapperClasses;

public class WrapperClass {
	public static void main(String[] args) {
		int x = 20;
		byte b = 100;
		//-----------------------------------------------------
		//All 6 number classes extends from abstract class Number
		Number bigNum = new Long(90000);
		Integer bigX = new Integer(990);
		Byte bigByy = new Byte((byte)100);
		Short bigSh = new Short((short)11000);
		short sh = 4500;
		Short bigSh2 = new Short(sh);
		Long bigLl = new Long(10000);
		Double bigDd = new Double(2345.55);
		Byte bigBy2 = new Byte("120");
		Float bigF = new Float("303.45f");
		Integer bigX2 = new Integer("22222");
		Double bigDd2 = new Double("2345.55f");
		
		//------------------------------------------------------
		Character ch = new Character('d');
		Boolean bigBb = new Boolean(false);
		//-------------------------------------------------------
		// conversion into class object with valueOf method
		Integer bigInt = Integer.valueOf(23);
		Double bigDou = Double.valueOf(75.55f);
		Long bigLong = Long.valueOf(40000);
		Byte bigBy4 = Byte.valueOf((byte)100);
		Character bigCh2 = Character.valueOf('k');
		//--------------------------------------------------------
		Integer bigInt2 = Integer.valueOf("77");
		System.out.println(Integer.MAX_VALUE);
//		Integer bigInt3 = Integer.valueOf("abc");		this line will throw Exception
		Double bigDou3 = Double.valueOf("777.77f");
		//--------------------------------------------------------------
		Integer bigInt5 = Integer.parseInt("777");
		Byte bigBy5 = Byte.parseByte("100");
		Float bigFl2 = Float.parseFloat("77.78f");
//		Integer bigInt6 = Integer.parseInt("abcd");		this line will throw Exception
		System.out.println(bigInt5.intValue());	//answer will be in primitive
		
		//---------------------------------------------------------
//Automatic conversion from small primitive to class object. (auto-boxing)
		Integer bigI5 = 900;		//new Integer(900);
		int smI = bigI5;			//unboxing(class object to primitive)
		// any operation occurs in primitive
		int sm2 = bigI5.intValue() +90;
		Integer bigSum = Integer.valueOf(bigI5.intValue() +90);
		Integer bigSum2 = bigI5 + 90; //(first unboxing and then boxing)
		System.out.println(bigX==bigSum);	// checks object equality
		System.out.println(bigX.equals(bigSum)); //content equality
		
		
	}
}
