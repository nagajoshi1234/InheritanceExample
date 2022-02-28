package main.java.inheritance;

public class Dog extends Bird {
	String val= "ravi from dog";
	

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public Dog() {
//		super();
		System.out.println("A new dog has been created!");
	}
	
	@Override
	public void sleep() {
		System.out.println("A dog sleeps...");
	}
	
	@Override
	public void eat() {
		System.out.println("A dog eats...");
		super.run();
//		Animal a1 = new Animal();
//		a1.run();
		new Animal().run();
		
	}
	
	public void runFast(){
		System.out.println("dog running fast");
	}
	
	
}
