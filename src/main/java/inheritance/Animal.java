package main.java.inheritance;
//import main.java.inheritance.Object;
//import java.lang.Object;

public class Animal extends Object{
	String name = "sandeep";
	String val= "ravi from animal";
	
	public Animal() {
//		super();
		System.out.println("A new animal has been created!");
//		System.out.println(val);		//ravi

	}
	
	public Animal(int a, int b) {
//		super();
		System.out.println("A new animal"+a+" has been created!"+b);
	}
	
	public void sleep() {
		String name = "sandeep123";
		System.out.println("An animal sleeps..."+name);
	}
	
	public void eat() {
		new Animal();
		System.out.println("An animal eats...");
	}
	
	public void run(){
		System.out.println("animal running");
	}

	public static void show() {
		System.out.println("showing animal");
	}

	private void printAll() {
		System.out.println("printing animal");
	}

	public final void print2() {
		System.out.println("final animal");
	}
	

	
}
