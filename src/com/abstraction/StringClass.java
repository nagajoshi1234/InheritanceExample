package com.abstraction;

public class StringClass {
	public static void main(String[] args) {
		//String is a immutable class
		String abc = new String("My name is Anthony Gonsalves");		//new String("My name is Anthony Gonsalves"); //JVM memory
		String val = "My name is Anthony Gonsalves";					//JVM memory
		String abc1 = new String("My name is Anthony Gonsalves");		//JVM memory
		String abc2 = "My name is Anthony Gonsalves";					//same as val
		System.out.println(abc1 == val);   								//false
		System.out.println(abc2 == val);								//true
		
		String abc3 = "shera";											//JVM memory
		abc3 = null;
		abc3 = "shera123";												//JVM memory
		
		String r1 ="ramneeek";
		String r2 ="ramneeek";
		String r3 = new String("ramneeek");
		String abc4 = "SHERA123";
		System.out.println(abc == val);  //==operator checks object equality
		System.out.println(abc1 == val);
		System.out.println(abc2 == val);
		System.out.println();
		System.out.println(r1 == r2);
		System.out.println(r3 == r2);
//		==   			return boolean, checks object equality or memory location 
//		instance method equals method			returns boolean, checks content equality
		System.out.println(abc.equals(val));		//true
		System.out.println(abc==val);				//false
		System.out.println("Ramneek works \n in Trantor");
//		instance method compareTo of String class		returns int
		int x = abc4.compareTo(abc3);						
		System.out.println("sssssssssssssssssssssssssssss"+x);
		System.out.println(abc.indexOf("o"));
		System.out.println(abc.lastIndexOf("o"));
		System.out.println(abc.indexOf("Gon"));
		System.out.println("This returnns:-"+abc.indexOf('z'));
		System.out.println(abc.length());
		System.out.println();
		abc ="Raghu";
		abc = null;  //now GC is eligible
		abc = "Raghu Sharma";
		System.out.println(abc.length());
		
		//mutable class

		StringBuffer sb = new StringBuffer("Mr/Mrs ");
		sb.append("John");
		sb.append(" Cena");
		sb.append(" is/are playing football");
		System.out.println(sb);
		sb.replace(0, 6, "Philips and");
		System.out.println(":aaaaaaaaaa "+sb);
		sb.replace(0, sb.length(), "");
		System.out.println(":aaaaaaaaaa "+sb);
		System.out.println(sb.length());

		System.out.println(sb.length());
		String ss = sb.toString();
		
	}
}


class TestImmutablestring1{  
	 public static void main(String args[]){  
		 
		String abc = new String("My name is Anthony Gonsalves");		//new String("My name is Anthony Gonsalves"); 
		String val = "My name is Anthony Gonsalves";					//JVM memory
		
//		//instance method equals method			returns boolean, checks content equality
		System.out.println(abc.equals(val));		//true
		System.out.println(abc==val);               //false (object equality)
		
		String abc3 = "hello123";											
		String abc4 = "HELLO123";
		
//		//instance method compareTo of String class		returns int
		System.out.println(abc4.compareTo(abc3));			//-32
		
		
		StringBuffer sb = new StringBuffer("Mr/Mrs ");				//StringBuffer object with initial contents
		sb.append("John");											//appending String
		sb.append(" Cena");											//appending String
		sb.append(" is/are playing football");						//appending String
		System.out.println(sb);										//printing String
		sb.replace(0, 6, "Philips and");							//replacing 1st 6 characters starting from zero
		System.out.println(":aaaaaaaaaa "+sb);						//printing String
		sb.replace(0, sb.length(), "");								//replacing complete String with ""
		System.out.println(":aaaaaaaaaa "+sb);						//printing String
		System.out.println(sb.length());							//printing String length which is zero
		
	 }  
	}  
